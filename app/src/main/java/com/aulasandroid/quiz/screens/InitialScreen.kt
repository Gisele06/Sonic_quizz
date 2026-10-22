package com.aulasandroid.quiz.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.aulasandroid.quiz.R
import com.aulasandroid.quiz.components.Botao
import kotlin.coroutines.coroutineContext

@Composable
fun InitialScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue),

    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
            ,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(space = 25.dp, alignment = Alignment.CenterVertically),

        ) {
            LogoSonic(modifier = modifier
                .size(160.dp)
            )
            Text(
                text = "MEGA QUIZ",
                color = Color.White,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

            Botao(
               text = "JOGAR",
                onClick = {}
            )

        }

    }
}

@Composable
fun LogoSonic(
    modifier: Modifier = Modifier
){

    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.sonic_logo),
        contentDescription = "Sonic"
    )
}