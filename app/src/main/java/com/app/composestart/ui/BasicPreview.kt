package com.app.composestart.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun TextPreview() {
    Column() {
        Column() {
            Text(text = "Salamu Alaikum")
            Text(
                text = "Salamu Alaikum",
                color = Color.Blue
            )
            Text(
                text = "Salamu Alaikum",
                fontSize = 30.sp
            )
            Text(
                "Salamu Alaikum",
                fontStyle = FontStyle.Italic
            )
            Text(
                "Salamu Alaikum",
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Salamu Alaikum",
                fontSize = 20.sp,
                fontWeight = FontWeight.Thin
            )
            Text(
                text = "Salamu Alaikum",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraLight
            )
            Text(
                text = "Salamu Alaikum",
                fontSize = 20.sp,
                fontWeight = FontWeight.Light
            )
            Text(
                text = "Salamu Alaikum",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal
            )
            Text(
                text = "Salamu Alaikum",
                fontSize = 20.sp,
                fontWeight = FontWeight.Medium
            )
            Text(
                text = "Salamu Alaikum",
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = "Salamu Alaikum",
                fontSize = 20.sp,
                fontWeight = FontWeight.W900
            )
            Text(
                text = "Salamu Alaikum",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "Salamu Alaikum",
                fontSize = 20.sp,
                fontWeight = FontWeight.Black
            )
        }
    }
}