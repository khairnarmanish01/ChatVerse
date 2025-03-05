package com.manish.chatverse.presentation.updatescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manish.chatverse.R

@Composable
fun ChannelItemsDesign(channel: Channels) {

    var isFollowing by remember { mutableStateOf(false) }

    Row(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 8.dp), verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(channel.image),
            contentDescription = "Channel Image",
            modifier = Modifier
                .size(60.dp)
                .padding(4.dp)
        )
        Spacer(Modifier.width(12.dp))
        Column {
            Text(text = channel.name, fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Text(text = channel.description, fontSize = 14.sp, color = Color.Gray)
        }
        Spacer(Modifier.weight(1f))

        Button(
            onClick = {isFollowing = !isFollowing},
            shape = RoundedCornerShape(50.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isFollowing) Color(240, 235, 235, 255) else colorResource(R.color.light_green),
                contentColor = if (!isFollowing) Color.White else Color.Gray
            ),
            modifier = Modifier
                .padding(8.dp)
                .height(36.dp)
        ) {
            Text(text = if(isFollowing) "Following" else "Follow", fontWeight = FontWeight.Bold)
        }
    }
}

data class Channels(
    val image: Int,
    val name: String,
    val description: String
)