import androidx.compose.material.Text
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import github.hongbeomi.kmp_sample.data.repository.KMMRepository
import github.hongbeomi.kmp_sample.di.initKoin

private val koin = initKoin().koin

fun main() = application {
    val repository = koin.get<KMMRepository>()
    Window(onCloseRequest = ::exitApplication) {
        Text(repository.getText())
    }
}