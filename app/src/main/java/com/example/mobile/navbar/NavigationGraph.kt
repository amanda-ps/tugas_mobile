package com.example.mobile.navbar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mobile.page1.AboutScreen
import com.example.mobile.page1.List1Screen
import com.example.mobile.page1.List2Screen

@Composable
fun NavigationGraph(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController, startDestination = BottomNavItem.List1.route, modifier = modifier) {
        composable(BottomNavItem.List1.route) { List1Screen(title = {}) }
        composable(BottomNavItem.List2.route) { List2Screen() }
        composable(BottomNavItem.About.route) { AboutScreen() }
    }
}
