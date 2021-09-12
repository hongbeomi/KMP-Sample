package github.hongbeomi.kmm_premierleague.data.repository

import github.hongbeomi.kmm_premierleague.data.service.PremierLeagueApiService
import github.hongbeomi.kmm_premierleague.domain.entity.Player

class PremierLeagueRepositoryImpl(
    private val service: PremierLeagueApiService
): PremierLeagueRepository {

    override suspend fun fetchPlayerList(): List<Player> {
        val staticInfo = service.fetchBootstrapStaticInfo()

        val elements = staticInfo.elements
        val teams = staticInfo.teams

        return elements.map {
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

}