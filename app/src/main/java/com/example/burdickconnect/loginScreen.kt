package com.example.burdickconnect

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import navigation.Routes

@Composable
fun loginScreen(nav: NavHostController) {

    val username_information: MutableState<String> = remember { mutableStateOf("") }
    val password_information: MutableState<String> = remember { mutableStateOf("") }

    val window_title = remember {
        mutableStateOf("User Login")
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Window Header
        Text (
            text = window_title.value,
            fontSize = 30.sp,
            modifier = Modifier.padding(20.dp)
        )

        Spacer(modifier = Modifier.padding(20.dp))
        Text(stringResource(R.string.login_prompt_label), fontSize = 20.sp, modifier = Modifier.padding(16.dp))

        // TODO: Make the text not expand all the way to the edges of the screen
        Row {
            Text(stringResource(R.string.username_prompt),
                fontSize = 24.sp,
                modifier = Modifier.padding(top = 24.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {username_value: String ->
                    username_information.value = username_value },
                placeholder = { "-- Username --" },
                modifier = Modifier.padding(16.dp)
            )
        }

        Row {
            Text(stringResource(R.string.password_prompt),
                fontSize = 24.sp,
                modifier = Modifier.padding(top = 24.dp)
            )
            OutlinedTextField(
                value = "",
                onValueChange = {password_value: String ->
                    password_information.value = password_value },
                placeholder = { "-- Password --" },
                modifier = Modifier.padding(16.dp)
            )
        }

        // TODO: Add navigation instructions for the onClick() event

        Button(onClick = { nav.navigate(Routes.locker.route) { launchSingleTop = true } }, modifier = Modifier
            .padding(16.dp)
            .height(40.dp)) {
            Text(text = "Submit")
        }


    }
}