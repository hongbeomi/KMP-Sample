package github.hongbeomi.kmm_premierleague.data.repository

import github.hongbeomi.kmm_premierleague.domain.entity.Player

interface PremierLeagueRepository {
    fun getPlayers(success: (List<Player>) -> Unit)
}