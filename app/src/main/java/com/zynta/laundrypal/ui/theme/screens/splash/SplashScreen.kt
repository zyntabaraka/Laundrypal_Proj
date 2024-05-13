package com.zynta.laundrypal.ui.theme.screens.splash

import android.view.animation.OvershootInterpolator
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zynta.laundrypal.R
import com.zynta.laundrypal.navigation.ROUTE_LOGIN
import com.zynta.laundrypal.navigation.ROUTE_WELCOME
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController:NavHostController) {

    val scale = remember {
        Animatable(0f)
    }

    // AnimationEffect
    LaunchedEffect(key1 = true) {
        scale.animateTo(
            targetValue = 0.7f,
            animationSpec = tween(
                durationMillis = 800,
                easing = {
                    OvershootInterpolator(4f).getInterpolation(it)
                })
        )
        delay(3000L)
        navController.navigate(ROUTE_WELCOME)
    }
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Spacer(modifier = Modifier.height(200.dp))
        
        Text(text = "LaundryPal",
            fontSize = 45.sp,
            color= Color.Blue,
            fontFamily = FontFamily.Cursive

        )
        Spacer(modifier = Modifier.height(30.dp))

        Image(painter = painterResource(id = R.drawable.laundry), contentDescription = "logo",
            modifier = Modifier.height(100.dp))

        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "The Ultimate laundry companion",
            fontSize = 20.sp,
            color = Color.Blue)

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Clean and Fresh",
            fontSize = 20.sp,
            color = Color.Blue)









    }

}


@Preview
@Composable
private fun Splashpre() {
    SplashScreen(navController = rememberNavController())
    
}