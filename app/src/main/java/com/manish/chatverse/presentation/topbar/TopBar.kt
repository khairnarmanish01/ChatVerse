package com.manish.chatverse.presentation.topbar

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(selectedTab: Int, onSearchClick: () -> Unit) {

    var showMenu by remember { mutableStateOf(false) }

    TopAppBar(
        title = {
            if(selectedTab == 0){
                Text(
                    "ChatVerse",
                    fontSize = 28.sp,
                    color = colorResource(R.color.light_green),
                    fontWeight = FontWeight.Bold
                )
            } else {
                Text(
                    text = when(selectedTab){
                        1 -> "Updates"
                        2 -> "Communities"
                        else -> "Calls"
                    },
                    fontSize = 24.sp,
                    color = Color.Black,
                )
            }
        },
        actions = {

            IconButton(onClick = {
                onSearchClick()
            }) {
                Icon(
                    Icons.Default.Search,
                    "search",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
            }

            if(selectedTab == 0 || selectedTab == 1){
                IconButton(onClick = {}) {
                    Icon(
                        painterResource(R.drawable.camera),
                        "camera",
                        tint = Color.Black,
                        modifier = Modifier.size(23.dp)
                    )
                }
            }

            IconButton(onClick = {showMenu = true}) {
                Icon(
                    Icons.Default.MoreVert,
                    "options",
                    tint = Color.Black,
                    modifier = Modifier.size(24.dp)
                )
                DropdownMenu(expanded = showMenu, onDismissRequest = { showMenu = false }) {
                    when(selectedTab){
                        0 -> {
                            DropdownMenuItem(
                                text = { Text("New group") },
                                onClick = { showMenu = false })
                            DropdownMenuItem(
                                text = { Text("Starred messages") },
                                onClick = { showMenu = false })
                        }
                        1 -> {
                            DropdownMenuItem(
                                text = { Text("Status Privacy") },
                                onClick = { showMenu = false })
                            DropdownMenuItem(
                                text = { Text("Create channel") },
                                onClick = { showMenu = false })
                        }
                        3 -> {
                            DropdownMenuItem(
                                text = { Text("Clear call log") },
                                onClick = { showMenu = false })
                        }
                    }
                    DropdownMenuItem(
                        text = { Text("Settings") },
                        onClick = { showMenu = false })
                }
            }

        }
    )
}