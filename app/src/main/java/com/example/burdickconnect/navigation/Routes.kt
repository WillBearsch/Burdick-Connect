package navigation

sealed class Routes(val route: String){
    object fitnessResources: Routes("fitnessResources")
    object locker: Routes("locker")
    object loginScreen: Routes("loginScreen")
    object welcomeScreen: Routes("welcomeScreen")
}
