package github.hongbeomi.kmm_premierleague.domain.entity

data class Player(
    val id: Int,
    val name: String,
    val team: String,
    val photoUrl: String,
    val points: Int,
    val currentPrice: Double,
    val goalsScored: Int,
    val assists: Int,
    val yellowCards: Int,
    val redCards: Int,
    val saves: Int,
    val cleanSheet: Int,
    val squadNumber: Int?
)