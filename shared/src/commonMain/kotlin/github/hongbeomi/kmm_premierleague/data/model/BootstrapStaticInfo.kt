package github.hongbeomi.kmm_premierleague.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BootstrapStaticInfo(
//    @SerialName("element_stats")
//    val elementStats: List<ElementStat>,
//    @SerialName("element_types")
//    val elementTypes: List<ElementType>,
    val elements: List<Element>,
//    val events: List<Event>,
    val teams: List<Team>,
//    @SerialName("total_players")
//    val totalPlayers: Int
)