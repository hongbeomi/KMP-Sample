package github.hongbeomi.kmm_premierleague.android.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.compose.runtime.Composable
import org.koin.androidx.viewmodel.ext.android.viewModel
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.remember

class MainActivity : AppCompatActivity() {

    private val viewModel by viewModel<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MainLayout(viewModel = viewModel)
        }
    }

}

@Composable
fun MainLayout(viewModel: MainViewModel) {
    val players = remember { viewModel.playerList }.collectAsState()
    Scaffold {
        players.value.forEach {
            Text(text = it.toString())
        }
    }
}