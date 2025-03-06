package com.manish.chatverse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.manish.chatverse.presentation.callscreen.CallScreen
import com.manish.chatverse.presentation.communitiesscreen.CommunitiesScreen
import com.manish.chatverse.presentation.homescreen.HomeScreen
import com.manish.chatverse.presentation.navigation.ChatVerseNavigation
import com.manish.chatverse.presentation.updatescreen.UpdateScreen
import com.manish.chatverse.presentation.updatescreen.Updates
import com.manish.chatverse.ui.theme.ChatVerseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatVerseTheme {
                ChatVerseNavigation()
            }
        }
    }
}