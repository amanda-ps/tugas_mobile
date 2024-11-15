package com.example.mobile.navbar

import android.annotation.SuppressLint
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.mobile.page1.AboutScreen
import com.example.mobile.page1.List1Screen
import com.example.mobile.page1.List2Screen

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyApp1() {
    var selectedMenu by remember { mutableStateOf("list1") }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = when (selectedMenu) {
                            "list1" -> "Screen 1"
                            "list2" -> "Screen 2"
                            "about" -> "About"
                            else -> "My App"
                        }
                    )
                }
            )
        },
        bottomBar = {
            BottomNavigation {
                BottomNavigationItem(
                    selected = selectedMenu == "list1",
                    onClick = { selectedMenu = "list1" },
                    label = { Text("List 1") },
                    icon = { Icon(Icons.Default.Home, contentDescription = "List 1") }
                )
                BottomNavigationItem(
                    selected = selectedMenu == "list2",
                    onClick = { selectedMenu = "list2" },
                    label = { Text("List 2") },
                    icon = { Icon(Icons.Default.Home, contentDescription = "List 2") }
                )
                BottomNavigationItem(
                    selected = selectedMenu == "about",
                    onClick = { selectedMenu = "about" },
                    label = { Text("About") },
                    icon = { Icon(Icons.Default.Person, contentDescription = "About") }
                )
            }
        },
        content = {
            when (selectedMenu) {
                "list1" -> List1Screen(title = {})
                "list2" -> List2Screen()
                "about" -> AboutScreen()
            }
        }
    )
}

