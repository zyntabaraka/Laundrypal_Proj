package com.zynta.laundrypal.ui.theme.screens.feedback

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun FeedbackScreen(navController:NavHostController) {

}

@Preview
@Composable
private fun Feedbackpre() {
    FeedbackScreen(navController = rememberNavController())
}