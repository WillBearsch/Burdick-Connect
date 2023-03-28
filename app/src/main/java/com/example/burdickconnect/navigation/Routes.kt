package navigation

sealed class Routes(val route: String){
    object fitnessResources: Routes("fitnessResources")
    object test: Routes("test")
}
