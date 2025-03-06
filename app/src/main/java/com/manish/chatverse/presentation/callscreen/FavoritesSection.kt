package com.manish.chatverse.presentation.callscreen

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manish.chatverse.R

@Composable
fun FavoritesSection() {

    val sampleFavoriteContacts = listOf(
        FavoriteContacts(
            image = R.drawable.sharukh_khan,
            name = "Shah Rukh Khan"
        ),
        FavoriteContacts(
            image = R.drawable.disha_patani,
            name = "Disha Patani"
        ),
        FavoriteContacts(
            image = R.drawable.bhuvan_bam,
            name = "Bhuvan"
        ),
        FavoriteContacts(
            image = R.drawable.rashmika,
            name = "Rashmika"
        ),FavoriteContacts(
            image = R.drawable.sharadha_kapoor,
            name = "Shraddha"
        ),
        FavoriteContacts(
            image = R.drawable.kartik_aaryan,
            name = "Kartik Aaryan"
        ),

    )

    Column(Modifier.padding(start = 16.dp)) {
        Text(
            text = "Favorites",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Row(
            Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            sampleFavoriteContacts.forEach{
                FavoritesItem(it)
            }
        }
    }
}

data class FavoriteContacts(
    val image: Int,
    val name: String,
)