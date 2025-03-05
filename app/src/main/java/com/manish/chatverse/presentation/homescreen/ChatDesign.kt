package com.manish.chatverse.presentation.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manish.chatverse.presentation.chatbox.ChatListModel

@Composable
fun ChatDesign(chatListModel: ChatListModel) {
    Row(Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {

        Image(
            painter = painterResource(chatListModel.image),
            "Profile Picture",
            modifier = Modifier
                .size(60.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(Modifier.width(12.dp))

        Column {
            Row(
                Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(chatListModel.name, fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text(chatListModel.time, fontSize = 11.sp, color = Color.Gray)
            }

            Text(chatListModel.lastMessage, color = Color.Gray, fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
        }
    }
}