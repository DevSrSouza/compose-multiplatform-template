import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import cafe.adriel.voyager.navigator.Navigator

@Composable
internal fun App() {
    MaterialTheme {
        SampleApplication()
    }
}

@Composable
internal fun SampleApplication() {
    Navigator(
        screen = BasicNavigationScreen(index = 0),
        onBackPressed = { currentScreen ->
            println("Navigator: Pop screen #${(currentScreen as BasicNavigationScreen).index}")
            true
        }
    )
}


expect fun getPlatformName(): String