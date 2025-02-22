package org.example

fun main() {
    val name = "Alice"
    val age = 25
    val population = 7_900_000_000L
    val interest = 2.5
    val price = 9.99f
    val isActive = true
    println("Name: $name, Age: $age, Next year: ${age.inc()}")
    println("World Population: $population")
    println("Interest: $interest, Price: $price")
    println("Is Active: $isActive")
}
