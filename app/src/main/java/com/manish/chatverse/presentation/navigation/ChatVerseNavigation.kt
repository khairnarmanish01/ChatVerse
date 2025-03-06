package com.manish.chatverse.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.manish.chatverse.presentation.callscreen.CallScreen
import com.manish.chatverse.presentation.communitiesscreen.CommunitiesScreen
import com.manish.chatverse.presentation.homescreen.HomeScreen
import com.manish.chatverse.presentation.splashscreen.SplashScreen
import com.manish.chatverse.presentation.updatescreen.UpdateScreen
import com.manish.chatverse.presentation.userregistrationscreen.UserRegistrationScreen
import com.manish.chatverse.presentation.welcomescreen.WelcomeScreen

@Composable
fun ChatVerseNavigation() {

    val navController = rememberNavController()

    NavHost(startDestination = Routes.SplashScreen, navController = navController) {

        composable<Routes.SplashScreen> {
            SplashScreen(navController)
        }

        composable<Routes.WelcomeScreen> {
            WelcomeScreen(navController)
        }

        composable<Routes.UserRegistrationScreen> {
            UserRegistrationScreen()
        }

        composable<Routes.HomeScreen> {
            HomeScreen()
        }

        composable<Routes.UpdatesScreen> {
            UpdateScreen()
        }

        composable<Routes.CommunitiesScreen> {
            CommunitiesScreen()
        }

        composable<Routes.CallsScreen> {
            CallScreen()
        }
    }
}