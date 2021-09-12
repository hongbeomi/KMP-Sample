package github.hongbeomi.kmm_premierleague.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Element(
    val assists: Int,
    val bonus: Int,
    val bps: Int,
    val chance_of_playing_next_round: Int?,
    val chance_of_playing_this_round: Int?,
    @SerialName("clean_sheets")
    val cleanSheets: Int,
    val code: Int,
    val corners_and_indirect_freekicks_order: Int?,
    val corners_and_indirect_freekicks_text: String,
    val cost_change_event: Int,
    val cost_change_event_fall: Int,
    val cost_change_start: Int,
    val cost_change_start_fall: Int,
    val creativity: String,
    val creativity_rank: Int,
    val creativity_rank_type: Int,
    val direct_freekicks_order: Int?,
    val direct_freekicks_text: String,
    val dreamteam_count: Int,
    val element_type: Int,
    val ep_next: String?,
    val ep_this: String?,
    val event_points: Int,
    @SerialName("first_name")
    val firstName: String,
    val form: String,
    val goals_conceded: Int,
    val goals_scored: Int,
    val ict_index: String,
    val ict_index_rank: Int,
    val ict_index_rank_type: Int,
    val id: Int,
    val in_dreamteam: Boolean,
    val influence: String,
    val influence_rank: Int,
    val influence_rank_type: Int,
    val minutes: Int,
    val news: String,
    val news_added: String?,
    @SerialName("now_cost")
    val nowCost: Int,
    val own_goals: Int,
    val penalties_missed: Int,
    val penalties_order: Int?,
    val penalties_saved: Int,
    val penalties_text: String,
    val photo: String,
    val points_per_game: String,
    @SerialName("red_cards")
    val redCards: Int,
    val saves: Int,
    @SerialName("second_name")
    val secondName: String,
    val selected_by_percent: String,
    val special: Boolean,
    @SerialName("squad_number")
    val squadNumber: Int?,
    val status: String,
    val team: Int,
    @SerialName("team_code")
    val teamCode: Int,
    val threat: String,
    val threat_rank: Int,
    val threat_rank_type: Int,
    @SerialName("total_points")
    val totalPoints: Int,
    val transfers_in: Int,
    val transfers_in_event: Int,
    val transfers_out: Int,
    val transfers_out_event: Int,
    val value_form: String,
    val value_season: String,
    val web_name: String,
    @SerialName("yellow_cards")
    val yellowCards: Int
)
