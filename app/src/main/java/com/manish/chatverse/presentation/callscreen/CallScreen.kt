package com.manish.chatverse.presentation.callscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
fun CallScreen() {

    var isSearching by remember { mutableStateOf(false) }

    val sampleRecentCalls = listOf(
        RecentCalls(
            image = R.drawable.disha_patani,
            name = "Disha",
            dateTime = "Yesterday, 11:44 PM",
            isMissed = false
        ),
        RecentCalls(
            image = R.drawable.akshay_kumar,
            name = "Akshay Kumar",
            dateTime = "Yesterday, 05:00 AM",
            isMissed = true
        ),
        RecentCalls(
            image = R.drawable.tripti_dimri,
            name = "Tripti",
            dateTime = "1 Mar, 03:40 PM",
            isMissed = false
        ),
        RecentCalls(
            image = R.drawable.sharadha_kapoor,
            name = "Sharadha",
            dateTime = "27 Feb, 06:34 PM",
            isMissed = false
        ),
        RecentCalls(
            image = R.drawable.girl2,
            name = "Alia",
            dateTime = "27 Feb, 11:44 AM",
            isMissed = false
        ),
        RecentCalls(
            image = R.drawable.disha_patani,
            name = "Disha",
            dateTime = "Yesterday, 11:44 PM",
            isMissed = true
        ),
        RecentCalls(
            image = R.drawable.disha_patani,
            name = "Disha",
            dateTime = "Yesterday, 11:44 PM",
            isMissed = false
        ),
        RecentCalls(
            image = R.drawable.disha_patani,
            name = "Disha",
            dateTime = "Yesterday, 11:44 PM",
            isMissed = false
        ),
        RecentCalls(
            image = R.drawable.disha_patani,
            name = "Disha",
            dateTime = "Yesterday, 11:44 PM",
            isMissed = false
        ),
        RecentCalls(
            image = R.drawable.disha_patani,
            name = "Disha",
            dateTime = "Yesterday, 11:44 PM",
            isMissed = false
        )
    )

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = {},
                containerColor = colorResource(R.color.light_green),
                contentColor = Color.White,
                modifier = Modifier.size(56.dp)
            ) {
                Icon(
                    painterResource(R.drawable.add_call),
                    "chats",
                    modifier = Modifier.size(28.dp)
                )
            }
        },

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
        Column(Modifier.padding(it).verticalScroll(rememberScrollState())) {

            Spacer(Modifier.height(4.dp))

            FavoritesSection()

            Button(
                onClick = {}, colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.light_green),
                    contentColor = Color.White
                ), modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(
                    text = "Start a new call",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Text(
                text = "Recent",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                modifier = Modifier.padding(start = 16.dp, bottom = 16.dp)
            )

            sampleRecentCalls.forEach{ data ->
                RecentCallItem(data)
            }
        }
    }
}

data class RecentCalls(
    val image: Int,
    val name: String,
    val isMissed: Boolean,
    val dateTime: String
)