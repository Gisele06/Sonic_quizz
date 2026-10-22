package com.aulasandroid.quiz.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun Botao(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    corFundo: Color = Color.Red,
    corTexto: Color = Color.White,
    shape: Shape = RoundedCornerShape(8.dp)
){
    Button(
        onClick = onClick,
        modifier = Modifier
            .size(width = 200.dp, height = 48.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = corFundo,
            contentColor = corTexto
        )
    ) {
        Text(
            text = text,
            fontSize = 20.sp
        )
    }
}