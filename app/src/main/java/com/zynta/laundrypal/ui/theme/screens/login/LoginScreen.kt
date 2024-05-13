package com.zynta.laundrypal.ui.theme.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zynta.laundrypal.R
import com.zynta.laundrypal.navigation.ROUTE_HOME
import com.zynta.laundrypal.navigation.ROUTE_REGISTRATION
import com.zynta.laundrypal.navigation.ROUTE_SETTINGS

@Composable
fun Loginscreen(navController: NavHostController) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context= LocalContext.current


    Column(verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray))



    {

        Spacer(modifier = Modifier.height(100.dp))
        Image(painter = painterResource(id = R.drawable.laundry), contentDescription = "logo" )

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Sign In",
            color = Color.Blue,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif)

        Spacer(modifier = Modifier.height(20.dp))
        Icon(imageVector = Icons.Default.Person, contentDescription = "per")
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value =email ,
            onValueChange ={email=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "Icon") },
            label = { Text(text = "Name or Email Address",
                color = Color.Black,
                fontSize = 20.sp)
            },


            modifier = Modifier.width(300.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value =password ,
            onValueChange ={password=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "pass") },
            label = { Text(text = "Enter Password",
                color = Color.Black,
                fontSize = 20.sp,)
            },
            modifier = Modifier.width(300.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate(ROUTE_HOME)
        },
            modifier = Modifier.width(300.dp)) {

            Text(
                text = "Login",
                fontSize = 20.sp
            )

        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {


            navController.navigate(ROUTE_REGISTRATION)
        },
            modifier = Modifier.width(300.dp)) {

            Text(
                text = "Create an account",
                fontSize = 20.sp
            )

        }
        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = {
            navController.navigate(ROUTE_SETTINGS)
        },
            modifier = Modifier.width(300.dp)) {

            Text(
                text = "Reset password",
                fontSize = 20.sp
            )

        }










    }

}

@Preview
@Composable
private fun Loginpre() {
    Loginscreen(navController = rememberNavController())
}

