package com.app.composestart.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.composestart.R


@Preview
@Composable
fun BoxPreview() {
    Column() {
        Box(
            modifier = Modifier.padding(8.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            Image(
                painter = painterResource(id = R.drawable.test_image),
                "Astronaut"
            )
            Text(text = "Astro")
        }
        Box(
            modifier = Modifier.padding(8.dp),
            contentAlignment = Alignment.TopEnd
        ) {
            Image(
                painter = painterResource(id =  R.drawable.test_image),
                "Astronaut"
            )
            Text(text = "Astro")
        }
        Box(
            modifier = Modifier.padding(8.dp),
            contentAlignment = Alignment.CenterEnd
        ) {
            Image(
                painter = painterResource(id =  R.drawable.test_image),
                "Astronaut"
            )
            Text(text = "Astro")
        }
        Box(
            modifier = Modifier.padding(8.dp),
            contentAlignment = Alignment.BottomEnd
        ) {
            Image(
                painter = painterResource(id =  R.drawable.test_image),
                "Astronaut"
            )
            Text(text = "Astro")
        }
        Box(
            modifier = Modifier.padding(8.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                painter = painterResource(id =  R.drawable.test_image),
                "Astronaut"
            )
            Text(text = "Astro")
        }
        Box(
            modifier = Modifier.padding(8.dp),
            contentAlignment = Alignment.BottomStart
        ) {
            Image(
                painter = painterResource(id =  R.drawable.test_image),
                "Astronaut"
            )
            Text(text = "Astro")
        }
        Box(
            modifier = Modifier.padding(8.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Image(
                painter = painterResource(id =  R.drawable.test_image),
                "Astronaut"
            )
            Text(text = "Astro")
        }
        Box(
            modifier = Modifier.padding(8.dp),
            contentAlignment = Alignment.TopStart
        ) {
            Image(
                painter = painterResource(id =  R.drawable.test_image),
                "Astronaut"
            )
            Text(text = "Astro")
        }
        Box(
            modifier = Modifier.padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id =  R.drawable.test_image),
                "Astronaut"
            )
            Text(text = "Astro")
        }
    }
}

@Preview
@Composable
fun RowPreview() {
    Column() {
        Row(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Red),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Top
        ) {
            Text(text = "Start")
            Text(text = "Start")
        }
        Row(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Bottom
        ) {
            Text(text = "Start")
            Text(text = "Start")
        }
        Row(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Red),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Start")
            Text(text = "Start")
        }
        Row(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Red),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = "Center")
            Text(text = "Center")
        }
        Row(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Green),
            horizontalArrangement = Arrangement.End
        ) {
            Text(text = "End")
            Text(text = "End")
        }
        Row(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Blue),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "SA")
            Text(text = "SA")
            Text(text = "SA")
            Text(text = "SA")
        }
        Row(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Yellow),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "SB")
            Text(text = "SB")
            Text(text = "SB")
            Text(text = "SB")
        }
        Row(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Red),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "SE")
            Text(text = "SE")
            Text(text = "SE")
            Text(text = "SE")
        }
    }
}

@Preview
@Composable
fun ColumnPreview() {
    Column() {
        Column(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Blue),
            verticalArrangement = Arrangement.Bottom
        ) {
            Text(text = "Bottom")
            Text(text = "Bottom")
        }
        Column(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Green),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.End
        ) {
            Text(text = "Bottom End")
            Text(text = "Bottom End")
        }
        Column(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Blue),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Bottom Center")
            Text(text = "Bottom Center")
        }
        Column(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Red),
            verticalArrangement = Arrangement.Top
        ) {
            Text(text = "Top")
            Text(text = "Top")
        }
        Column(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Green),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = "SpaceBetween")
            Text(text = "SpaceBetween")
            Text(text = "SpaceBetween")
        }
        Column(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Yellow),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Text(text = "SpaceAround")
            Text(text = "SpaceAround")
            Text(text = "SpaceAround")
            Text(text = "SpaceAround")
        }
        Column(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Green),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "SpaceEvenly")
            Text(text = "SpaceEvenly")
            Text(text = "SpaceEvenly")
            Text(text = "SpaceEvenly")
        }
        Column(
            modifier = Modifier
                .size(100.dp, 100.dp)
                .background(Color.Red),
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Center")
            Text(text = "Center")
        }
    }
}
