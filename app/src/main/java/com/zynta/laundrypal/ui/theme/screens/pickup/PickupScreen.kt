package com.zynta.laundrypal.ui.theme.screens.pickup

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun PickupScreen(navController: NavHostController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)) {
        Row {
            
        }

    }

}

@Preview
@Composable
private fun Pickuppre() {
    PickupScreen(navController = rememberNavController())
}