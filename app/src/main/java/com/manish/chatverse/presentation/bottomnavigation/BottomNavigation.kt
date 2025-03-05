package com.manish.chatverse.presentation.bottomnavigation

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manish.chatverse.R

@Composable
fun BottomNavigation(selectedTab: Int) {
    NavigationBar(
        modifier = Modifier
            .fillMaxWidth(),
        containerColor = Color.White
    ) {
        val tabs = listOf(
            Triple(R.drawable.message_icon, "Chats", "Chats"),
            Triple(R.drawable.update_icon, "Updates", "Updates"),
            Triple(R.drawable.communities_icon, "Communities", "Communities"),
            Triple(R.drawable.telephone, "Calls", "Calls")
        )

        tabs.forEachIndexed { index, (icon, label, contentDescription) ->
            val interactionSource = remember { MutableInteractionSource() }
            NavigationBarItem(selected = selectedTab == index, icon = {
                Icon(
                    painter = painterResource(icon),
                    contentDescription = contentDescription,
                    modifier = Modifier.size(24.dp),
                    tint = if (selectedTab == index) colorResource(R.color.dark_green) else Color.Black
                )
            }, label = {
                Text(
                    text = label,
                    color = Color.Black,
                    fontSize = 14.sp,
                    fontWeight = if (selectedTab == index) FontWeight.ExtraBold else FontWeight.SemiBold
                )
            }, colors = NavigationBarItemDefaults.colors(
                indicatorColor = Color.Green.copy(alpha = 0.15f)
            ), onClick = { }, interactionSource = interactionSource
            )
        }
    }
}

//    BottomAppBar(tonalElevation = 12.dp) {
//        Row(
//            Modifier
//                .fillMaxWidth()
//                .padding(horizontal = 10.dp),
//            horizontalArrangement = Arrangement.SpaceBetween
//        ) {
//            Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                Icon(
//                    painter = painterResource(R.drawable.message_icon),
//                    contentDescription = "chats tab icon",
//                    modifier = Modifier.size(28.dp)
//                )
//                Spacer(Modifier.height(8.dp))
//                Text(text = "Chats", fontWeight = FontWeight.Bold)
//            }
//
//            Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                Icon(
//                    painter = painterResource(R.drawable.update_icon),
//                    contentDescription = "updates tab icon",
//                    modifier = Modifier.size(28.dp)
//                )
//                Spacer(Modifier.height(8.dp))
//                Text(text = "Updates", fontWeight = FontWeight.Bold)
//            }
//
//            Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                Icon(
//                    painter = painterResource(R.drawable.communities_icon),
//                    contentDescription = "communities tab icon",
//                    modifier = Modifier.size(28.dp)
//                )
//                Spacer(Modifier.height(8.dp))
//                Text(text = "Communities", fontWeight = FontWeight.Bold)
//            }
//
//            Column(horizontalAlignment = Alignment.CenterHorizontally) {
//                Icon(
//                    painter = painterResource(R.drawable.telephone),
//                    contentDescription = "calls tab icon",
//                    modifier = Modifier.size(28.dp)
//                )
//                Spacer(Modifier.height(8.dp))
//                Text(text = "Calls", fontWeight = FontWeight.Bold)
//            }
//        }
//    }