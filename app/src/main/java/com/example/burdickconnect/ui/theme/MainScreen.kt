package com.example.burdickconnect.ui.theme

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.burdickconnect.locker
import navigation.BurdickNavGraph
import navigation.Routes

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen(){
    val nav = rememberNavController()
    Scaffold(
        topBar = {
            TopBar(nav = nav)
        },
    ){
        BurdickNavGraph(nav)
    }
}

@Composable
private fun TopBar(
    nav: NavHostController
) {
    var expanded by remember { mutableStateOf(false) }
    val context = LocalContext.current
    val backStack by nav.currentBackStackEntryAsState()
    val destination = backStack?.destination
    TopAppBar(
        title = {Text("Burdick Connect")},
        navigationIcon = {
            Box(
                modifier = Modifier.fillMaxWidth()
                    .wrapContentSize(Alignment.TopEnd)
            )
            {
                IconButton(onClick = { expanded = !expanded }) {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "More"
                    )
                }
                DropdownMenu(
                    expanded = expanded,
                    onDismissRequest = { expanded = false }
                ) {
                    DropdownMenuItem(
                        onClick = { nav.navigate(Routes.locker.route) }
                    ) {
                        Text(text = "Reserve a locker")
                    }
                    DropdownMenuItem(
                        onClick = { nav.navigate(Routes.fitnessResources.route) }
                    ) {
                        Text(text = "FitnessResources")
                    }
                }
            }},

    )
}