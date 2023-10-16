package my.lovely.gamecounter.domain.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun GameNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "main")
    {
        composable(route = MainScreen.route) {
            MainScreen.screen()
        }

        composable(route = Balance.route) {
            Balance.screen()
        }
        composable(route = Streets.route) {
            Streets.screen()
        }
    }
}
