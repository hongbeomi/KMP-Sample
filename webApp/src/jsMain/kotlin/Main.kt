package github.hongbeomi.webapp

import github.hongbeomi.kmp_sample.data.repository.KMMRepository
import github.hongbeomi.kmp_sample.di.initKoin
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H1
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.renderComposable

private val koin = initKoin().koin

fun main() {
    val repository = koin.get<KMMRepository>()
    renderComposable(rootElementId = "root") {
        Div {
           H1 {
               Text(repository.getText())
           }
        }
    }
}