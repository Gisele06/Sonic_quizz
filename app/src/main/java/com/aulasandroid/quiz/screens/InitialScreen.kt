package com.aulasandroid.quiz.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.aulasandroid.quiz.R

@Composable
fun InitialScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)

    ){
        LogoSonic()
        Text(
            text = "MEGA QUIZ",
            color = Color.White,
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun LogoSonic(
    modifier: Modifier = Modifier
){

    Image(
        modifier = modifier.size(70.dp),
        painter = painterResource(R.drawable.sonic_logo),
        contentDescription = "Cat Enemy"
    )
}