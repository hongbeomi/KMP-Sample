package github.hongbeomi.kmm_premierleague.data.repository

import github.hongbeomi.kmm_premierleague.data.service.PremierLeagueApiService
import github.hongbeomi.kmm_premierleague.domain.entity.Player
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class PremierLeagueRepositoryImpl(
    private val service: PremierLeagueApiService
): PremierLeagueRepository {

    private val mainScope: CoroutineScope = MainScope()

    private val _playerList = MutableStateFlow<List<Player>>(emptyList())
    val playerList = _playerList.asStateFlow()

    init {
        mainScope.launch {
            fetchPlayers()
        }
    }

    private suspend fun fetchPlayers() {
        val staticInfo = service.fetchBootstrapStaticInfo()

        val elements = staticInfo.elements
        val teams = staticInfo.teams

        _playerList.value = elements.map {
            Player(
                id = it.id,
                name = "${it.firstName} ${it.secondName}",
                team = teams.find { t -> t.code == it.teamCode }?.name ?: "",
                photoUrl = "https://resources.premierleague.com/premierleague/photos/players/110x140/p${it.code}.png",
                points = it.totalPoints,
                currentPrice = it.nowCost / 10.0,
                goalsScored = it.goals_scored,
                assists = it.assists,
                yellowCards = it.yellowCards,
                redCards = it.redCards,
                saves = it.saves,
                cleanSheet = it.cleanSheets,
                squadNumber = it.squadNumber
            )
        }
    }

    override fun getPlayers(success: (List<Player>) -> Unit) {
        mainScope.launch {
            playerList.collect {
                success(it.sortedByDescending { it.points })
            }
        }
    }

}