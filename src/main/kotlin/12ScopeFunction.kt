package org.example

import java.awt.Rectangle
import java.io.File

fun main() {
    let()
    run()
    with()
    apply()
    also()
}

private fun let() {
    val userInput: String? = "Hello Kotlin"
    userInput?.let {
        println("User input: $it")
    }
}

private fun run() {
    val rectangle = Rectangle(5, 10)
    val area = rectangle.run {
        width * height
    }
    println("Area: $area")
}

private fun with() {
    val car = Car()
//    car.startEngine()
//    car.drive()
//    car.stop()

    with(car) {
        startEngine()
        drive()
        stop()
    }
}

private fun apply() {
//    val car = Car()
//    car.color = "black"
//    car.doors = 4

    val car = Car().apply {
        color = "black"
        doors = 4
    }
}

private fun also() {
    val file = File("data.txt").also {
        println("Creating file: ${it.name}")
    }
}


class Car {
    var color: String = ""
    var doors: Int = 0
    fun startEngine() {
    }

    fun drive() {
    }

    fun stop() {
    }
}
