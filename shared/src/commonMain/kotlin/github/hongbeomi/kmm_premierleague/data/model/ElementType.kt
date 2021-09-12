package github.hongbeomi.kmm_premierleague.data.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ElementType(
    @SerialName("element_count")
    val elementCount: Int,
    val id: Int,
    @SerialName("plural_name")
    val pluralName: String,
    @SerialName("plural_name_short")
    val pluralNameShort: String,
    @SerialName("singular_name")
    val singularName: String,
    @SerialName("singular_name_short")
    val singularNameShort: String,
    @SerialName("squad_max_play")
    val squadMaxPlay: Int,
    @SerialName("squad_min_play")
    val squadMinPlay: Int,
    @SerialName("squad_select")
    val squadSelect: Int,
    @SerialName("sub_positions_locked")
    val subPositionsLocked: List<Int>,
    @SerialName("ui_shirt_specific")
    val uiShirtSpecific: Boolean
)
