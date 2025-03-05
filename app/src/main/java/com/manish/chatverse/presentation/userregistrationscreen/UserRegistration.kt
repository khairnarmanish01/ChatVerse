package com.manish.chatverse.presentation.userregistrationscreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme.colorScheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manish.chatverse.R

@Composable
@Preview(showSystemUi = true)
fun UserRegistrationScreen() {
    var expanded by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf("India") }
    var countryCode by remember { mutableStateOf("+91") }
    var phoneNumber by remember { mutableStateOf("") }

    BoxWithConstraints(
        Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        val maxWidth = maxWidth

        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Enter your phone number",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = colorResource(R.color.dark_green)
            )

            Spacer(Modifier.height(24.dp))

            Row(horizontalArrangement = Arrangement.Center) {
                Text(text = "ChatVerse will need to verify your phone number.", fontSize = 14.sp)
                Spacer(Modifier.width(4.dp))
                Text(text = "What's", color = colorResource(R.color.dark_green), fontSize = 14.sp)
            }
            Text(text = "my number?", color = colorResource(R.color.dark_green), fontSize = 14.sp)

            Spacer(Modifier.height(16.dp))

            // Dropdown Button
            Box {
                TextButton(
                    onClick = { expanded = true },
                    modifier = Modifier.widthIn(min = 180.dp, max = maxWidth * 0.7f)
                ) {
                    Box(
                        Modifier.fillMaxWidth()
                    ) {
                        Text(
                            text = selectedCountry,
                            color = Color.Black,
                            modifier = Modifier.align(Alignment.Center)
                        )
                        Icon(
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = null,
                            tint = colorResource(R.color.light_green),
                            modifier = Modifier.align(Alignment.CenterEnd)
                        )
                    }
                }

                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false },
                    modifier = Modifier.widthIn(min = 180.dp, max = maxWidth * 0.7f)
                ) {
                    listOf("India", "Australia", "Brazil", "Russia", "America").forEach { country ->
                        DropdownMenuItem(text = { Text(country) }, onClick = {
                            selectedCountry = country
                            expanded = false
                        })
                    }
                }
            }

            HorizontalDivider(
                Modifier
                    .widthIn(min = 180.dp, max = maxWidth * 0.7f)
                    .padding(horizontal = 16.dp),
                thickness = 2.dp,
                color = colorResource(R.color.light_green)
            )

            Spacer(Modifier.height(16.dp))

            // Phone Input Fields
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextField(
                    value = countryCode,
                    onValueChange = { countryCode = it },
                    modifier = Modifier.width(80.dp),
                    singleLine = true,
                    textStyle = LocalTextStyle.current.copy(fontSize = 18.sp, color = Color.Black),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = colorResource(R.color.light_green),
                        unfocusedIndicatorColor = colorResource(R.color.light_green)
                    )
                )

                Spacer(Modifier.width(8.dp))

                TextField(
                    value = phoneNumber,
                    onValueChange = { phoneNumber = it },
                    modifier = Modifier.weight(1f),
                    placeholder = { Text("phone number") },
                    singleLine = true,
                    textStyle = LocalTextStyle.current.copy(fontSize = 18.sp, color = Color.Black),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        focusedIndicatorColor = colorResource(R.color.light_green),
                        unfocusedIndicatorColor = colorResource(R.color.light_green)
                    )
                )
            }

            Spacer(Modifier.height(26.dp))

            Text(
                text = "Carrier charges may apply",
                fontSize = 12.sp,
                color = colorScheme.onSurface.copy(alpha = 0.6f)
            )

            Spacer(Modifier.height(16.dp))

            Button(
                onClick = {},
                shape = RoundedCornerShape(6.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(R.color.dark_green),
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .height(48.dp)
            ) {
                Text("Next", fontSize = 16.sp)
            }
        }
    }
}