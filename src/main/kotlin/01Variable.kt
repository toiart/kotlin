package org.example

const val PI = 3.14159

fun main() {
    vals()
    vars()
    constvals()
}

fun vals() {
    val idNumber = "1122038940030"
//    idNumber = "322"
    println(idNumber)
}

fun vars() {
    var age = 25
    age++
    println(age)
}

fun constvals() {
    println(PI)
}