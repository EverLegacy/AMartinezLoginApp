package com.example.amartinezloginapp

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.serialization.Serializable

@Serializable
data class NavInfo(val screen: String)

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(
                onSignUpClick = { navController.navigate("register") }
            )
        }
        composable("register") {
            RegisterScreen()
        }
    }
}
