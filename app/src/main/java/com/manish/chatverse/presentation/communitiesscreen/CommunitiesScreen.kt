package com.manish.chatverse.presentation.communitiesscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manish.chatverse.R
import com.manish.chatverse.presentation.SearchBar
import com.manish.chatverse.presentation.bottomnavigation.BottomNavigation
import com.manish.chatverse.presentation.topbar.TopBar

@Composable
fun CommunitiesScreen() {

    var isSearching by remember { mutableStateOf(false) }

    val communities = listOf(
        Communities(
            image = R.drawable.img,
            name = "Tech Enthusiasts",
            members = 256
        ),
        Communities(
            image = R.drawable.img,
            name = "Photography Lover",
            members = 342
        ),
        Communities(
            image = R.drawable.img,
            name = "Traveller United",
            members = 321
        )
    )

    Scaffold(
        topBar = {
            if (isSearching) {
                SearchBar { isSearching = false }
            } else {
                TopBar(2, onSearchClick = { isSearching = true })
            }
        },

        bottomBar = {
            BottomNavigation(selectedTab = 2)
        }
    ) {
        Column(Modifier.padding(it)) {

            HorizontalDivider()

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(
                        R.color.light_green
                    )
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(text = "Start a new community", fontSize = 16.sp, fontWeight = FontWeight.Bold)
            }

            Spacer(Modifier.height(8.dp))

            Text(
                text = "Your Communities",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
            )

            LazyColumn {
                items(communities){
                    CommunityItemDesign(it)
                }
            }
        }
    }
}