package github.hongbeomi.kmm_premierleague.android.ui.widget

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import github.hongbeomi.kmm_premierleague.android.R
import github.hongbeomi.kmm_premierleague.android.ui.theme.fontFamily
import github.hongbeomi.kmm_premierleague.android.ui.theme.white
import github.hongbeomi.kmm_premierleague.domain.entity.Player

@Composable
fun PlayerCard(player: Player) {
    val readyToDraw = remember { mutableStateOf(false) }
    val textStyleBody1 = MaterialTheme.typography.body1
    val textStyle = remember { mutableStateOf(textStyleBody1) }

    Box {
        Image(
            painterResource(id = R.drawable.background),
            contentDescription = "",
            alignment = Alignment.Center
        )
        Image(
            painter = rememberImagePainter(player.teamUrl),
            contentDescription = player.team,
            alignment = Alignment.TopStart,
            modifier = Modifier
                .padding(
                    top = 32.dp,
                    start = 24.dp
                )
                .size(16.dp)
        )
        Column(
            Modifier
                .padding(
                    horizontal = 24.dp,
                    vertical = 32.dp
                )
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = rememberImagePainter(player.photoUrl),
                contentDescription = player.name,
                modifier = Modifier
                    .width(72.dp)
                    .height(80.dp),
            )
            Text(
                modifier = Modifier
                    .padding(top = 8.dp)
                    .fillMaxWidth()
                    .drawWithContent {
                        if (readyToDraw.value) drawContent()
                    },
                text = player.secondName.uppercase(),
                color = white,
                textAlign = TextAlign.Center,
                fontSize = 13.sp,
                fontFamily = fontFamily,
                onTextLayout = { textLayoutResult ->
                    if (textLayoutResult.didOverflowWidth) {
                        textStyle.value = textStyle.value.copy(fontSize = (11.sp * 0.9))
                    } else {
                        readyToDraw.value = true
                    }
                }
            )
        }
    }
}