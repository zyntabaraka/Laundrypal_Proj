package com.zynta.laundrypal.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zynta.laundrypal.ui.theme.screens.feedback.FeedbackScreen
import com.zynta.laundrypal.ui.theme.screens.history.HistoryScreen
import com.zynta.laundrypal.ui.theme.screens.home.HomeScreen
import com.zynta.laundrypal.ui.theme.screens.login.Loginscreen
import com.zynta.laundrypal.ui.theme.screens.profile.PaymentScreen
import com.zynta.laundrypal.ui.theme.screens.pickup.PickupScreen
import com.zynta.laundrypal.ui.theme.screens.registration.RegistrationScreen
import com.zynta.laundrypal.ui.theme.screens.settings.SettingsScreen
import com.zynta.laundrypal.ui.theme.screens.splash.SplashScreen
import com.zynta.laundrypal.ui.theme.screens.tracking.TrackingScreen
import com.zynta.laundrypal.ui.theme.screens.welcome.WelcomeScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String= ROUTE_SPLASH) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {

        composable(ROUTE_WELCOME) {
            WelcomeScreen(navController)
        }
        composable(ROUTE_LOGIN) {
            Loginscreen(navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }
        composable(ROUTE_PICKUP) {
            PickupScreen(navController)
        }

        composable(ROUTE_REGISTRATION) {
            RegistrationScreen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_SETTINGS){
            SettingsScreen(navController)
        }




    }
}



