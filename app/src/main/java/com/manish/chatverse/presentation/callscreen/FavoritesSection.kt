package com.manish.chatverse.presentation.callscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.manish.chatverse.R

@Composable
fun FavoritesSection() {

    Column(Modifier.padding(start = 4.dp, end = 4.dp, top = 4.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painterResource(id = R.drawable.sharukh_khan),
            contentDescription = null,
            modifier = Modifier.size(60.dp).clip(CircleShape),
            contentScale = ContentScale.Crop
        )
    }

}