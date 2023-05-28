package com.darkcoders.login_page

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.darkcoders.login_page.ui.theme.Login_PageTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login_PageTheme() {
               
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LoginScreen()
                }
            }
        }
    }

    private fun logged(Username: String ,Password: String ){
        if(Username == "Yash" && Password == "Yash@1234"){
            Toast.makeText(this,"Logged !!" , Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this , "Wrong credential" , Toast.LENGTH_SHORT).show()
        }
    }


    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun LoginScreen(){

        val focusManager = LocalFocusManager.current
        var username by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "hello again!",
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                fontSize = 25.sp
            )
            Text(
                text = "Welcome",
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                fontSize = 25.sp
            )
            Text(
                text = "Back",
                color = Color.Blue,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Monospace,
                fontSize = 25.sp
            )

            OutlinedTextField(
                value = username,
                onValueChange = { username = it },
                leadingIcon = { Icon(Icons.Default.Person, contentDescription = "person") },
                placeholder = { Text(text = "Enter your name") },
                label = { Text(text = "Username") },
                modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
                keyboardActions = KeyboardActions(
                    onNext = {focusManager.moveFocus(FocusDirection.Next)}
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                )
            )
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                leadingIcon = { Icon(Icons.Default.Info, contentDescription = "Info") },
                placeholder = { Text(text = "Enter your password") },
                label = { Text(text = "Password") },
                modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
                keyboardActions = KeyboardActions(
                    onNext = {focusManager.moveFocus(FocusDirection.Next)}
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next
                )
            )
            OutlinedButton(
                onClick = { logged(username, password) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp)
            ) {

                Text(text = "Login")
            }


        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Login_PageTheme {}
}