package com.manish.chatverse.presentation.splashscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.manish.chatverse.R
import com.manish.chatverse.presentation.navigation.Routes
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {

    LaunchedEffect(Unit) {
        delay(1000)
        navController.navigate(Routes.WelcomeScreen){
            popUpTo<Routes.SplashScreen> { inclusive = true }
        }
    }

    Box(Modifier.fillMaxSize(), ) {
        Image(
            painterResource(R.drawable.whatsapp_icon),
            "whatsapp icon",
            modifier = Modifier
                .size(80.dp)
                .align(Alignment.Center)
        )

        Column(
            Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "From", fontSize = 18.sp, fontWeight = FontWeight.Bold)

            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painterResource(R.drawable.logo),
                    "mk develops",
                    Modifier.size(12.dp)
                )

                Text(text = " MK Develops", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = colorResource(R.color.light_green))
            }
        }
    }
}