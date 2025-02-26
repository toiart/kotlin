package org.example

fun main() {
    val rabbit = Rabbit("Bunny")
    rabbit.walk()
    rabbit.makeSound()
}

open class Pet(val name: String) {
    fun makeSound() {
        println("$name makes a sound")
    }
}

interface Walkable {
    fun walk() {
        println("Walking...")
    }
}

class Rabbit(name: String) : Pet(name), Walkable
