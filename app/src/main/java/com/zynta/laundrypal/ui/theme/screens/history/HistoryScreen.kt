package com.zynta.laundrypal.ui.theme.screens.history

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun HistoryScreen(navController:NavHostController) {

}

@Preview
@Composable
private fun Historypre() {
    HistoryScreen(navController = rememberNavController())
}