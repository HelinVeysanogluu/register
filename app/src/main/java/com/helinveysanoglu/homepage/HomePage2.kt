package com.helinveysanoglu.homepage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomePage2(){

    val person = remember { mutableStateOf("") }
    val lock = remember { mutableStateOf("") }
    val google = remember { mutableStateOf("") }
    val apple = remember { mutableStateOf("") }
    val facebook = remember { mutableStateOf("") }

    Column (modifier = Modifier
        .fillMaxSize()
        .background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally){

        Spacer(modifier = Modifier.height(100.dp))
        Text(text = "Hello Again!", fontSize = 35.sp)
        Spacer(modifier = Modifier.height(15.dp))
        Text(text = "Welcome back", fontSize = 20.sp, color = Color.Gray)
        Text(text = "you've been missed!", fontSize = 20.sp, color = Color.Gray)
        Spacer(modifier = Modifier.height(40.dp))

        OutlinedTextField(
            leadingIcon = {Icon(imageVector = Icons.Default.Person, contentDescription = "")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 18.dp),
            value = person.value,
            onValueChange = {person.value = it},
            placeholder ={ Text(text = "Enter username", color = Color.Gray)},
            colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.White, unfocusedBorderColor = Color.LightGray),
            shape = RoundedCornerShape(15.dp))

        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(
            leadingIcon = {Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 18.dp),
            value = lock.value,
            onValueChange = {lock.value = it},
            placeholder ={ Text(text = "Password", color = Color.Gray)},
            colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.White, unfocusedBorderColor = Color.LightGray),
            shape = RoundedCornerShape(15.dp))

        Spacer(modifier = Modifier.height(8.dp))
        Text(modifier = Modifier.padding(start = 215.dp),text = "Recovery Password", color = Color.Gray)
        Spacer(modifier = Modifier.height(60.dp))
        Button(modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .padding(horizontal = 18.dp),
            onClick = { /*TODO*/ }) {
            Text(text ="Sign in", fontSize = 20.sp)
        }
        Spacer(modifier = Modifier.height(40.dp))

        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 60.dp),
            verticalAlignment = Alignment.CenterVertically
        ){
            Box(modifier = Modifier
                .height(1.dp)
                .weight(0.25f)
                .background(Color.Gray))
            Spacer(modifier = Modifier.width(15.dp))
            Text(text = "Or continue with", color = Color.Gray, fontSize = 14.sp)
            Spacer(modifier = Modifier.width(15.dp))
            Box(modifier = Modifier
                .height(1.dp)
                .weight(0.25f)
                .background(Color.Gray))
        }
        Spacer(modifier = Modifier.height(50.dp))

        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 100.dp)
        ){
            OutlinedTextField(modifier = Modifier.width(50.dp),
                colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.White),
                leadingIcon = { Icon(imageVector = Icons.Default.Search , contentDescription = "google")},
                value = google.value,
                onValueChange = {google.value = it})

            Spacer(modifier = Modifier.width(20.dp))

            OutlinedTextField(modifier = Modifier.width(50.dp),
                colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.White),
                leadingIcon = { Icon(imageVector = Icons.Default.Face , contentDescription = "apple")},
                value = apple.value,
                onValueChange = {apple.value = it})

            Spacer(modifier = Modifier.width(20.dp))

            OutlinedTextField(modifier = Modifier.width(50.dp),
                colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.White),
                leadingIcon = { Icon(imageVector = Icons.Default.ThumbUp , contentDescription = "facebook")},
                value = facebook.value,
                onValueChange = {facebook.value = it})
        }
        Spacer(modifier = Modifier.height(40.dp))

        Row (modifier = Modifier
            .fillMaxWidth()
            .padding(start = 115.dp)
        ){
            Text(text = "Not a member?", fontSize = 12.sp)
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Register Now", fontSize = 12.sp, color = Color.Magenta)
        }
    }
}

@Preview
@Composable
fun PreviewHomePage2(){
    HomePage2()
}