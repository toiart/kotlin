package org.example

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
    val numbers = mutableListOf(1, 2, 3, 4, 5)

    val sum = numbers.run {
        add(6)
        add(7)
        sum()
    }

    println("Sum: $sum")
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
