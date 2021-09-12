package github.hongbeomi.kmm_premierleague.data.model

import kotlinx.serialization.Serializable

@Serializable
data class TopElementInfo(
    val id: Int,
    val points: Int
)