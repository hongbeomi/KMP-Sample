package github.hongbeomi.kmm_premierleague.android.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import github.hongbeomi.kmm_premierleague.android.ui.widget.MainScreen
import github.hongbeomi.kmm_premierleague.android.ui.widget.PlayerGridList
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<MainViewModel>()

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainLayout(viewModel = viewModel)
        }
    }

}

@ExperimentalFoundationApi
@Composable
fun MainLayout(viewModel: MainViewModel) {
    val players = remember { viewModel.playerList }.collectAsState()
    MainScreen {
        PlayerGridList(players = players.value)
    }
}