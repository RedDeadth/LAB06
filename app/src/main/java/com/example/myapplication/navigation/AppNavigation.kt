package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.CustomTopBar
import com.example.myapplication.ui.HomeScreen
import com.example.myapplication.ui.UserProfile
import com.example.myapplication.ui.InfoScreen
import com.example.myapplication.ui.SearchScreen
import com.example.myapplication.ui.SettingsScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(navController)
        }
        composable("profile") {
            UserProfile()
        }
        composable("info") {
            InfoScreen()
        }
        composable("settings") {
            SettingsScreen()
        }
        composable("search") {
            SearchScreen()
        }
    }

}
