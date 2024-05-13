package com.zynta.laundrypal.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.zynta.laundrypal.R
import com.zynta.laundrypal.navigation.ROUTE_PICKUP



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController:NavHostController) {
    Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.DarkGray)
        ) {
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = { search = it },

            placeholder = { Text(text = "Search",
                color = Color.White
            ) },
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "search"
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 20.dp,
                    end = 20.dp,
                )
        )



        //Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {

            //Row
            Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                Text(text = "Our Services",
                    fontSize = 30.sp,
                    color = Color.Black)
            }

        }



            //Box
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentAlignment = Alignment.Center
            ) {

                //Row
                Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
                    //Card
                    Card(
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp),
                    ) {
                        Column() {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.fragrance),
                                    contentDescription = "new",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            androidx.compose.material3.Text(
                                text = "Wash and fold",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card

                    Spacer(modifier = Modifier.width(10.dp))


                    //Card
                    Card(
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp),
                    ) {
                        Column() {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.clean),
                                    contentDescription = "new",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            androidx.compose.material3.Text(
                                text = "Delicate wash and Hang dry",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card

                    Spacer(modifier = Modifier.width(10.dp))


                    //Card
                    Card(
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp),
                    ) {
                        Column() {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.iron),
                                    contentDescription = "new",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            androidx.compose.material3.Text(
                                text = "Ironing and folding services",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card

                    Spacer(modifier = Modifier.width(10.dp))


                    //Card
                    Card(
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp),
                    ) {
                        Column() {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.dry),
                                    contentDescription = "new",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            androidx.compose.material3.Text(
                                text = "Dry cleaning",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card

                    Spacer(modifier = Modifier.width(10.dp))


                    //Card
                    Card(
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp),
                    ) {
                        Column() {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.wash),
                                    contentDescription = "new",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            androidx.compose.material3.Text(
                                text = "Commercial laundry",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }

                    }
                    //End of card

                    Spacer(modifier = Modifier.width(10.dp))



                    //Card
                    Card(
                        modifier = Modifier
                            .height(200.dp)
                            .width(200.dp),
                    ) {
                        Column() {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentAlignment = Alignment.Center,
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.laundry),
                                    contentDescription = "new",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                            androidx.compose.material3.Text(
                                text = "Special care services",
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }


            }
        //Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {

            //Row
            Row{
                Text(text = "In partnership with skilled workers who ensure proper care of your laundry and deliver professional cleaning services",
                    fontSize = 20.sp,
                    color = Color.Black,
                    )
            }



        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            contentAlignment = Alignment.Center
        ){
            Row{
                Text(text = "FREE PICKUP AND DROP-OFF!!",
                    fontSize = 20.sp,
                    color = Color.Black,
                )
            }

        }




        //Box
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {

            Button(
                onClick = {
                    navController.navigate(ROUTE_PICKUP)
                },
                modifier = Modifier.width(300.dp)
            ) {

                Text(
                    text = "Schedule Pickup",
                    fontSize = 20.sp
                )

            }
        }









        }

    }


@Preview
@Composable
private fun Homepre() {
    HomeScreen(navController = rememberNavController())
}