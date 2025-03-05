package com.manish.chatverse.presentation.callscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.manish.chatverse.presentation.SearchBar
import com.manish.chatverse.presentation.bottomnavigation.BottomNavigation
import com.manish.chatverse.presentation.topbar.TopBar

@Composable
fun CallScreen() {

    var isSearching by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            if (isSearching) {
                SearchBar { isSearching = false }
            } else {
                TopBar(3, onSearchClick = { isSearching = true })
            }
        },

        bottomBar = {
            BottomNavigation(selectedTab = 3)
        }
    ) {
        Column(Modifier.padding(it)) {

            HorizontalDivider()


        }
    }
}