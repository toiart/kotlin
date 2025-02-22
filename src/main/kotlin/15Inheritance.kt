package org.example

fun main() {
    val dog = Dog("Buddy")
    dog.makeSound()
    dog.bark()
}

open class Pet(val name: String) {
    fun makeSound() {
        println("$name makes a sound")
    }
}

class Dog(name: String) : Pet(name) {
    fun bark() {
        println("$name barks!")
    }
}
