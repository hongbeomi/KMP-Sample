package github.hongbeomi.kmm_premierleague.data.model

import kotlinx.serialization.Serializable

@Serializable
data class ChipPlay(
    val chip_name: String,
    val num_played: Int
)