package org.example

fun main() {
    forLoops()
    whileLoops()
    doWhileLoops()
}

private fun forLoops() {
    for (i in 1..5) {
        println("Number: $i")
    }

    for (i in 1..10 step 2) {
        println(i)
    }

    for (i in 5 downTo 1) {
        println(i)
    }
}

fun whileLoops() {
    var count = 5
    while (count > 0) {
        println("Countdown: $count")
        count--
    }
}

fun doWhileLoops() {
    var input: String
    do {
        print("Enter 'yes' to continue: ")
        input = readlnOrNull() ?: ""
    } while (input.lowercase() != "yes")
    println("Thank you!")
}
