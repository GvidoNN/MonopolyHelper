package my.lovely.gamecounter.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import my.lovely.gamecounter.R
import my.lovely.gamecounter.domain.navigation.Balance
import my.lovely.gamecounter.domain.navigation.Destinations
import my.lovely.gamecounter.domain.navigation.MainScreen
import my.lovely.gamecounter.domain.navigation.Streets


@Composable
fun BottomMainNavBar(
    allScreens: List<Destinations>,
    onTabSelected: (Destinations) -> Unit,
    navController: NavController,
    modifier: Modifier = Modifier
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    NavigationBar(
        modifier = modifier,
        containerColor = Color.DarkGray,
        tonalElevation = 5.dp
    ) {
        allScreens.forEach {
            val selectedTab = it.route == backStackEntry.value?.destination?.route
            NavigationBarItem(
                selected = it.route == navController.currentDestination?.route,
                onClick = { onTabSelected(it) },
                icon = {
                    Icon(
                        painter = painterResource(it.icon),
                        contentDescription = null,
                        modifier = Modifier.size(100.dp)
                    )
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color.Green,
                    unselectedIconColor = Color.Red
                ),
            )
        }

    }

}