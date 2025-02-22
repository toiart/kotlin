package org.example

fun main() {
    val rabbit = Rabbit("Bunny")
    rabbit.walk()
}

interface Walkable {
    fun walk() {
        println("Walking...")
    }
}

class Rabbit(name: String) : Pet(name), Walkable
