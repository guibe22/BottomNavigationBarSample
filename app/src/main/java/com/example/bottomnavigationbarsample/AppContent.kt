package com.example.bottomnavigationbarsample

import Destination
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.navigation.NavController
import androidx.compose.material.BottomNavigation

@Composable
fun Transaction(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {

    }
}
@Composable
fun  Tasks(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {

    }
}
@Composable
fun  Budget(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {

    }
}
@Composable
fun  Settings(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {

    }
}


@Composable
fun BottomNavigationBar(navController: NavController, appItems:
List<Destination>) {
    BottomNavigation(
        backgroundColor = colorResource(id =
        R.color.purple_700),
        contentColor = Color.White
    ) {

    }
}