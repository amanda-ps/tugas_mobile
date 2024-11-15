package com.example.mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.mobile.navbar.BottomNavigationBar
import com.example.mobile.navbar.MyApp1
import com.example.mobile.navbar.NavigationGraph
import com.example.mobile.ui.theme.HomeScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                MyApp()
                MaterialTheme {
                    HomeScreen()
                    MyApp1()
                }
            }
        }
    }



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        NavigationGraph(navController, Modifier.padding(innerPadding))

    }
}












