package org.example

fun main() {
    val cat = Cat("Whiskers")
    cat.makeSound()
}

abstract class Animal(val name: String) {
    abstract fun makeSound()
}

class Cat(name: String) : Animal(name) {
    override fun makeSound() {
        println("$name meows!")
    }
}
