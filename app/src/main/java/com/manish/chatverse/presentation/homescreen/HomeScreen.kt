package com.manish.chatverse.presentation.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.manish.chatverse.R
import com.manish.chatverse.presentation.SearchBar
import com.manish.chatverse.presentation.bottomnavigation.BottomNavigation
import com.manish.chatverse.presentation.chatbox.ChatListModel
import com.manish.chatverse.presentation.communitiesscreen.CommunitiesScreen
import com.manish.chatverse.presentation.topbar.TopBar
import com.manish.chatverse.presentation.updatescreen.Updates

@Composable
@Preview(showSystemUi = true)
fun HomeScreen() {

    var isSearching by remember { mutableStateOf(false) }

    var selectedTab by remember { mutableIntStateOf(0) }

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.light_green),
                contentColor = Color.White,
                modifier = Modifier.size(56.dp)
            ) {
                Icon(
                    painterResource(R.drawable.add_chat_icon),
                    "chats",
                    modifier = Modifier.size(28.dp)
                )
            }
        },

        topBar = {
            if (isSearching) {
                SearchBar{isSearching = false}
            } else {
                TopBar(0, onSearchClick = {isSearching = true})
            }
        },

        bottomBar = {
            if(!isSearching){ BottomNavigation(0) }
        }
    ) {
        Column(Modifier.padding(it)) {
            Chats()
        }
    }
}

@Composable
fun Chats() {

    val chatData = listOf(
        ChatListModel(
            R.drawable.sharukh_khan,
            name = "Shah Rukh Khan",
            time = "03:11 PM",
            lastMessage = "Hello"
        ),
        ChatListModel(
            R.drawable.rashmika,
            name = "Rashmika",
            time = "11:30 PM",
            lastMessage = "Hey, how are you"
        ),
        ChatListModel(
            R.drawable.salman_khan,
            name = "Salman Khan",
            time = "09:30 PM",
            lastMessage = "Aau Kya?"
        ),
        ChatListModel(
            R.drawable.ajay_devgn,
            name = "Ajay Devgan",
            time = "10:23 AM",
            lastMessage = "Bolo juba kesari"
        ),
        ChatListModel(
            R.drawable.carryminati,
            name = "Carry Bhai",
            time = "10:20 PM",
            lastMessage = "Bol be gendu"
        ),
        ChatListModel(
            R.drawable.sharadha_kapoor,
            name = "Shraddha",
            time = "02:20 PM",
            lastMessage = "Hi, Kaise ho?"
        )
    )

    HorizontalDivider()
    LazyColumn {
        items(chatData) { data ->
            ChatDesign(data)
        }
    }
}