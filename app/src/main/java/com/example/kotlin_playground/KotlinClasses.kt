package com.example.kotlin_playground
fun main(){
    val subKlass:MySubClass = MySubClass(38)
}
open class MyParentClass(var myProp:Int){

}
class MySubClass(myProp:Int):MyParentClass(myProp){

}