package com.example.burdickconnect

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import android.content.res.Configuration
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun fitnessResources(
    link: (String)->Unit,
)
{
    Column(modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text("Fitness Resources",
            fontSize = 40.sp,
            )

        Row{
            Column{
                Button(
                    onClick = { link },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Link1")
                }
                Button(
                    onClick = { link },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Link2")
                }
                Button(
                    onClick = { link },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Link3")
                }
            }

            Column{
                Button(
                    onClick = { link },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Link4")
                }
                Button(
                    onClick = { link },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Link5")
                }
                Button(
                    onClick = { link },
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text("Link6")
                }
            }

        }
    }
}