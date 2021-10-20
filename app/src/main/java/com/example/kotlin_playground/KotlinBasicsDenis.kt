package com.example.kotlin_playground

fun main(){
    val tony = User(7,"Tony")
    val Becky = tony.copy(userName = "Becky")

    val (userID,userName) = tony
    val id = tony.component1()
    val name = tony.component2()

    println("user 2 details: ID: $userID, Name: $userName")

}

class Person(firstName:String = "John",lastName:String = "Doe"){
    var hobby:String? = null
    get() {
        return field?.lowercase()
    }

    init {
        println("Created Person with First Name: $firstName, and Last Name: $lastName")
    }
}

data class User(val userID:Int, var userName:String){

}