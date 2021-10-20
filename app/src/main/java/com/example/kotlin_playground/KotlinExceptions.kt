package com.example.kotlin_playground

import android.icu.number.IntegerWidth
import java.lang.Exception

fun main() {
    println(getInt("10.7"))
    println(getInt("77"))
}

fun getInt(value: String): Int {
    return try {
        Integer.parseInt(value)
    } catch (e: Exception) {
        println("Kindly input a number without decimal points. Returning '0'")
        println(e.message)
        return 0;
    }

}