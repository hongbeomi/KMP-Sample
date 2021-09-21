package github.hongbeomi.kmm_premierleague.android.ui.widget

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import github.hongbeomi.kmm_premierleague.domain.entity.Player

@ExperimentalFoundationApi
@Composable
fun PlayerGridList(players: List<Player>) {
    LazyVerticalGrid(
        cells = GridCells.Fixed(3)
    ) {
        items(players) {
            PlayerCard(player = it)
        }
    }
}