package com.helinveysanoglu.homepage

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.helinveysanoglu.register.R


@Composable
fun HomePage() {
    Column(modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(1.dp))
        Card(modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(1f)
            .padding(10.dp),
            shape = RoundedCornerShape(25.dp),
            elevation = CardDefaults.cardElevation(10.dp)
        ) {
            Image(modifier = Modifier.fillMaxSize(),painter = painterResource(id = R.drawable.images2), contentDescription = "", contentScale = ContentScale.Crop) }

        Spacer(modifier = Modifier.height(40.dp))
        Text(text = "Discover Your", fontSize = 30.sp)
        Text(text = "Dream Job Here", fontSize = 30.sp)
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Love of the most exciting jobs roles", fontSize = 18.sp , color = Color.Gray)
        Text(text = "based on your interest in study major", fontSize = 18.sp, color = Color.Gray)
        Spacer(modifier = Modifier.height(100.dp))

        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 40.dp)
        ){
            Button(modifier = Modifier
                .weight(0.5f),
                onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray, contentColor = Color.DarkGray)) {
                Text(text = "Register", fontSize = 20.sp)
            }
            OutlinedButton(modifier = Modifier
                .weight(0.5f),
                onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color.White, contentColor = Color.Gray)) {
                Text(text = "Sign in", fontSize = 20.sp)
            }
        }
    }
}

@Preview
@Composable
fun PreviewHomePage(){
    HomePage()
}