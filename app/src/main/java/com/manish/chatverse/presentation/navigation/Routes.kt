package com.manish.chatverse.presentation.navigation

import kotlinx.serialization.Serializable

sealed class Routes {

    @Serializable
    data object SplashScreen : Routes()

    @Serializable
    data object WelcomeScreen : Routes()

    @Serializable
    data object UserRegistrationScreen : Routes()

    @Serializable
    data object HomeScreen : Routes()

    @Serializable
    data object UpdatesScreen : Routes()

    @Serializable
    data object CommunitiesScreen : Routes()

    @Serializable
    data object CallsScreen : Routes()
}