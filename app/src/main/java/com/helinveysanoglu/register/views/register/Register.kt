package com.helinveysanoglu.register.views.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.helinveysanoglu.register.R

@Composable
fun Register(){

    val mail = remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(50.dp))
        Image(modifier = Modifier.size(200.dp),painter = painterResource(id = R.drawable.images), contentDescription = "Kullanıcı fotoğrafı")
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Register", fontSize = 45.sp, color = Color.DarkGray)
        Spacer(modifier = Modifier.height(30.dp))
        Button(modifier = Modifier
            .height(50.dp)
            .fillMaxWidth()
            .padding(horizontal = 25.dp),onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(containerColor = Color.LightGray, contentColor = Color.Gray)) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(modifier = Modifier.size(50.dp),imageVector = Icons.Default.AccountCircle, contentDescription = "", tint = Color.DarkGray)
                Spacer(modifier = Modifier.width(15.dp))
                Text(text = "Continue With Google", fontSize = 20.sp)
            }

        }
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "or", fontSize = 20.sp, color = Color.Gray)
        Spacer(modifier = Modifier.weight(1f))
        Card (modifier = Modifier
            .fillMaxWidth()
            .height(340.dp)
            .padding(start = 30.dp),
            shape = RoundedCornerShape(topStart = 60.dp)
        ){
            Column (modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally){
                Spacer(modifier = Modifier.height(50.dp))
                OutlinedTextField(
                    leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "")},
                    modifier = Modifier.fillMaxWidth(),
                    value = mail.value,
                    onValueChange = {mail.value = it},
                    placeholder = { Text(text = "Enter Mail", color = Color.Gray, fontWeight = FontWeight.Bold)},
                    colors = OutlinedTextFieldDefaults.colors(unfocusedContainerColor = Color.White, unfocusedBorderColor = Color.LightGray),
                    shape = RoundedCornerShape(18.dp)
                )
                Spacer(modifier = Modifier.height(40.dp))
                Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
                    Text(text = "Continue", fontSize = 18.sp)
                }
                Spacer(modifier = Modifier.weight(1f))
                Row (modifier = Modifier.padding(bottom = 20.dp)){
                    Text(text = "Already have an account?", fontSize = 15.sp)
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(text = "Login", color = Color.Magenta, fontSize = 15.sp, fontStyle = FontStyle.Italic)
                }
                }
            }


        }
    }


@Preview
@Composable
fun PreviewRegister(){
    Register()
}