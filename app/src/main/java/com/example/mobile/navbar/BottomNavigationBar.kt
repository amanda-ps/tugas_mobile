package com.example.mobile.navbar

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(navController: NavHostController) {
    val items = listOf(
        BottomNavItem.List1,
        BottomNavItem.List2,
        BottomNavItem.About
    )
    NavigationBar {
        val navBackStackEntry = navController.currentBackStackEntryAsState().value
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    when (item) {
                        is BottomNavItem.List1 -> Icon(Icons.Filled.Home, contentDescription = item.title)
                        is BottomNavItem.List2 -> Icon(Icons.Filled.Home, contentDescription = item.title)
                        is BottomNavItem.About -> Icon(Icons.Filled.Person, contentDescription = item.title)
                    }
                },
                label = { Text(text = item.title) },
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.startDestinationId) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
