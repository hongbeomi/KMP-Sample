package github.hongbeomi.kmm_premierleague.android.ui.widget

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import github.hongbeomi.kmm_premierleague.android.ui.theme.darkMode
import github.hongbeomi.kmm_premierleague.android.ui.theme.lightMode

@Composable
fun MainScreen(
    isDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (isDarkTheme) darkMode else lightMode

    MaterialTheme(colors = colors, content = content)
}