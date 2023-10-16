package my.lovely.gamecounter

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import my.lovely.gamecounter.domain.navigation.BottomNavigationScreens
import my.lovely.gamecounter.domain.navigation.Destinations
import my.lovely.gamecounter.domain.navigation.GameNavHost
import my.lovely.gamecounter.domain.navigation.MainScreen
import my.lovely.gamecounter.domain.navigation.navigateSingleTopTo
import my.lovely.gamecounter.presentation.components.BottomMainNavBar
import my.lovely.gamecounter.presentation.theme.GameCounterTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GameCounterTheme {
                var currentScreen: Destinations by remember { mutableStateOf(MainScreen) }
                val navController = rememberNavController()
                // A surface container using the 'background' color from the theme
                Scaffold(
                    bottomBar = {
                        BottomMainNavBar(
                            allScreens = BottomNavigationScreens,
                            onTabSelected = {
                                            navController.navigateSingleTopTo(it.route)
                            },
                            navController = navController
                        )
                    }
                ) {
                    GameNavHost(navController = navController)
                }
            }
        }
    }
}

