package com.manish.chatverse.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manish.chatverse.R
import com.manish.chatverse.presentation.SearchBar
import com.manish.chatverse.presentation.bottomnavigation.BottomNavigation
import com.manish.chatverse.presentation.topbar.TopBar

@Composable
fun UpdateScreen() {

    var isSearching by remember { mutableStateOf(false) }
    val scrollState = rememberScrollState()

    val status = listOf(
        StatusData(
            image = R.drawable.disha_patani,
            name = "Disha Patani",
            time = "Just now"
        ),
        StatusData(
            image = R.drawable.mrbeast,
            name = "Mr. Beast",
            time = "25 min ago"
        ),
        StatusData(
            image = R.drawable.salman_khan,
            name = "Salman Bhai",
            time = "03:11 PM"
        ),
        StatusData(
            image = R.drawable.rajkummar_rao,
            name = "Rajkumar",
            time = "Yesterday"
        )
    )

    val channels = listOf(
        Channels(
            image = R.drawable.neat_roots,
            name = "NeatRoots",
            description = "Latest news in tech"
        ),
        Channels(
            image = R.drawable.img,
            name = "Puzzlers",
            description = "New day new puzzles"
        ),
        Channels(
            image = R.drawable.meta,
            name = "Meta",
            description = "Explore the world"
        ),
    )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                modifier = Modifier.size(56.dp),
                containerColor = colorResource(R.color.light_green),
                contentColor = Color.White
            ) {
                Icon(
                    painter = painterResource(R.drawable.baseline_photo_camera_24),
                    contentDescription = "camera icon"
                )
            }
        },
        topBar = {
            if (isSearching) {
                SearchBar { isSearching = false }
            } else {
                TopBar(1, onSearchClick = { isSearching = true })
            }
        },
        bottomBar = {
            if (!isSearching) {
                BottomNavigation(1)
            }
        }
    ) {
        Column(
            Modifier
                .padding(it)
                .fillMaxSize()
                .verticalScroll(scrollState)
        ) {
            Text(
                text = "Status",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            MyStatus()

            Text(
                text = "Recent updates ",
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            status.forEach { data ->
                StatusItem(data)
            }

            Spacer(Modifier.height(16.dp))

            HorizontalDivider()

            Text(
                text = "Channels",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
            )

            Spacer(Modifier.height(8.dp))

            Text(
                text = "Stay updated on topics that matter to you. Find channels to follow below.",
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(Modifier.height(32.dp))

            Text(
                text = "Find channels to follow",
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray,
                modifier = Modifier.padding(horizontal = 16.dp)
            )

            Spacer(Modifier.height(32.dp))

            channels.forEach {
                ChannelItemsDesign(it)
            }

            Spacer(Modifier.height(75.dp))
        }
    }
}

@Composable
fun Updates() {

    val status = listOf(
        StatusData(
            image = R.drawable.disha_patani,
            name = "Disha Patani",
            time = "Just now"
        ),
        StatusData(
            image = R.drawable.mrbeast,
            name = "Mr. Beast",
            time = "25 min ago"
        ),
        StatusData(
            image = R.drawable.salman_khan,
            name = "Salman Bhai",
            time = "03:11 PM"
        ),
        StatusData(
            image = R.drawable.rajkummar_rao,
            name = "Rajkumar",
            time = "Yesterday"
        )
    )

    val channels = listOf(
        Channels(
            image = R.drawable.neat_roots,
            name = "NeatRoots",
            description = "Latest news in tech"
        ),
        Channels(
            image = R.drawable.img,
            name = "Puzzlers",
            description = "New day new puzzles"
        ),
        Channels(
            image = R.drawable.meta,
            name = "Meta",
            description = "Explore the world"
        ),
    )

    Text(
        text = "Status",
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.Black,
        modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
    )

    MyStatus()

    Text(
        text = "Recent updates ",
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.Gray,
        modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
    )

    status.forEach {
        StatusItem(it)
    }

    Spacer(Modifier.height(16.dp))

    HorizontalDivider()

    Text(
        text = "Channels",
        fontSize = 20.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.Black,
        modifier = Modifier.padding(horizontal = 12.dp, vertical = 8.dp)
    )

    Spacer(Modifier.height(8.dp))

    Text(
        text = "Stay updated on topics that matter to you. Find channels to follow below.",
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.Gray,
        modifier = Modifier.padding(horizontal = 16.dp)
    )

    Spacer(Modifier.height(32.dp))

    Text(
        text = "Find channels to follow",
        fontSize = 14.sp,
        fontWeight = FontWeight.SemiBold,
        color = Color.Gray,
        modifier = Modifier.padding(horizontal = 16.dp)
    )

    Spacer(Modifier.height(32.dp))

    channels.forEach {
        ChannelItemsDesign(it)
    }

    Spacer(Modifier.height(75.dp))
}
