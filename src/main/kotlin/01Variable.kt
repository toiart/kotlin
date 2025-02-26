package org.example

const val PI = 3.14159

fun main() {
    kotlinVals()
    kotlinVars()
    kotlinConstVals()
}

fun kotlinVals() {
    val color: String = "Red"
    val idNumber = "1122038940030"
//    idNumber = "322"
    println(color)
    println(idNumber)
}

fun kotlinVars() {
    var age = 25
    age++
    println(age)
}

fun kotlinConstVals() {
    println(PI)
}