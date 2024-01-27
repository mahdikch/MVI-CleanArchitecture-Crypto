package com.mahdi.mvicleancryptocurrency.presentation.activity

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavigationScreens(val route: String, val icon: ImageVector, val label: String) {
    object Home : BottomNavigationScreens("home", Icons.Default.Home, "Home")
    object Favourite : BottomNavigationScreens("Favourite", Icons.Default.Favorite, "Favourite")
    object Profile : BottomNavigationScreens("profile", Icons.Default.Person, "Profile")
}