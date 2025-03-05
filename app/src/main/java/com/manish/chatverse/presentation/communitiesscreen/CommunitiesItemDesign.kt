package com.manish.chatverse.presentation.communitiesscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manish.chatverse.R

@Composable
fun CommunityItemDesign(community: Communities) {

    Row(
        Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(community.image),
            contentDescription = null,
            modifier = Modifier.size(60.dp)
        )

        Spacer(Modifier.width(12.dp))

        Column {
            Text(text = community.name, fontSize = 16.sp, fontWeight = FontWeight.Bold)
            Text(text= "${community.members} members", color = Color.Gray, fontSize = 14.sp)
        }
    }

}

data class Communities(
    val image: Int,
    val name: String,
    val members: Int
)