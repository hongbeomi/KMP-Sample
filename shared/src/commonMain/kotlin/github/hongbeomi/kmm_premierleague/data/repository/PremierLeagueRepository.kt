package github.hongbeomi.kmm_premierleague.data.repository

import github.hongbeomi.kmm_premierleague.data.model.BootstrapStaticInfo
import github.hongbeomi.kmm_premierleague.domain.entity.Player

interface PremierLeagueRepository {
    suspend fun fetchPlayerList(): List<Player>
}