package navigation

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.example.burdickconnect.fitnessResources
import com.example.burdickconnect.locker
import com.example.burdickconnect.loginScreen


@Composable
fun BurdickNavGraph(
    navController: NavHostController = rememberNavController()
) {

    NavHost(
        navController = navController,
//        startDestination = Routes.fitnessResources.route
        startDestination = Routes.loginScreen.route
    ) {
        composable(Routes.fitnessResources.route){
            fitnessResources(
                link = {},)
        }
        composable(Routes.locker.route){
            locker(
            isReserved = false,
            onReservedChanged = { isReserved -> },
            isLocked = false,
            onLockedChanged = { isLocked -> },
         )
            Button(onClick = { navController.popBackStack() }) {
                Text(text = "Back")
            }
        }
        composable(Routes.loginScreen.route) {
            loginScreen()
        }
    }
}