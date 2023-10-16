package my.lovely.gamecounter.domain.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import my.lovely.gamecounter.R
import my.lovely.gamecounter.presentation.screens.balance.BalanceScreen
import my.lovely.gamecounter.presentation.screens.streets.StreetScreen

interface Destinations {
    val icon: Int
    val route: String
    val screen: @Composable () -> Unit
}

object MainScreen : Destinations {
    override val icon: Int = R.drawable.main
    override val route: String = "main"
    override val screen: @Composable () -> Unit = { my.lovely.gamecounter.presentation.screens.main.MainScreen() }
}

object Streets : Destinations {
    override val icon: Int = R.drawable.main
    override val route: String = "streets"
    override val screen: @Composable () -> Unit = { StreetScreen() }
}

object Balance : Destinations {
    override val icon: Int = R.drawable.main
    override val route: String = "balance"
    override val screen: @Composable () -> Unit = { BalanceScreen() }
}

val BottomNavigationScreens = listOf(MainScreen, Streets, Balance)

fun NavHostController.navigateSingleTopTo(route: String) =
    this.navigate(route) { launchSingleTop = true }