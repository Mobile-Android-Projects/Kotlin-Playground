package com.example.kotlin_playground

abstract class Mammal(weight: Double, gender: String, origin: String) {
    abstract var topSpeed: Double
    abstract fun feed()
    open fun talk() {
        println("I a mammal")
    }
}

open class Human(
    hobby: String,
    weight: Double,
    gender: String,
    origin: String,
    override var topSpeed: Double
) :
    Mammal(weight, gender, origin) {

    override fun feed() {
        println("Eating pizza")
    }
}

class Warrior(hobby: String, weight: Double, gender: String, origin: String, topSpeed: Double) :
    Human(hobby, weight, gender, origin, topSpeed) {

    override fun feed() {
        println("Eating Broccoli")
    }

}