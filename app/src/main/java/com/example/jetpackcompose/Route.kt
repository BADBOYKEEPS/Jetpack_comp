package com.example.jetpackcompose


sealed class Route (val route:String){
    object Login:Route("Login")
}