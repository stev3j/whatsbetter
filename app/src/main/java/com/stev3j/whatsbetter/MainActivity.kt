package com.stev3j.whatsbetter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.stev3j.whatsbetter.ui.theme.Red
import com.stev3j.whatsbetter.ui.theme.WhatsbetterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsbetterTheme {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.weight(1f))
                    Icon(
                        painter = painterResource(id = R.drawable.ic_whatsbetter_logo),
                        contentDescription = "icWhatsbetterLogo",
                        tint = Color.Unspecified
                    )
                    Icon(
                        modifier = Modifier.padding(top = 40.dp),
                        painter = painterResource(id = R.drawable.txt_whatsbetter),
                        contentDescription = "icWhatsbetterLogo",
                        tint = Color.Unspecified
                    )
                    Text(
                        modifier = Modifier.padding(top = 16.dp),
                        text = "간단하게 즐기는 밸런스 게임",
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.weight(1f))

                    Button(
                        modifier = Modifier
                            .padding(horizontal = 24.dp)
                            .padding(bottom = 16.dp)
                            .fillMaxWidth()
                            .height(56.dp),
                        shape = RoundedCornerShape(20.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Red),
                        onClick = { /*TODO*/ }
                    ) {
                        Text(
                            text = "로그인",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WhatsbetterTheme {
        Greeting("Android")
    }
}