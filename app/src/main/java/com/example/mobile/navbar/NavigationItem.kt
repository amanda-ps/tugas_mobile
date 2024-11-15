package com.example.mobile.navbar

sealed class BottomNavItem(var title: String, var route: String) {
    object List1 : BottomNavItem("List 1", "list1")
    object List2 : BottomNavItem("List 2", "list2")
    object About : BottomNavItem("About", "about")
}


