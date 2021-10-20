package com.example.kotlin_playground

fun main(){
    //immutable array list of type double
    val numberList = ArrayList<Double>(5)
    numberList.add(350000.0)
    numberList.add(700000.0)
    numberList.add(1400000.0)
    numberList.add(2800000.0)
    numberList.add(5600000.0)

    //value to hold the total of the numbers
    var numberTotal = 0.0
    for(i in numberList)
    {
        numberTotal += i
    }
    val numberAvg = numberTotal/numberList.size
    println("The average of the numberList is: $numberAvg")
    println("The total of the numberList is: ${numberTotal} ")
}