package org.example

fun main() {
    greet()
    greet("Alice")

    orderCoffee()
    orderCoffee(size = "Large")
    orderCoffee(sugar = false)
    orderCoffee(
        sugar = false,
        size = "Small"
    )
}

fun greet(name: String = "Guest") = println("Hello, $name!")

fun orderCoffee(size: String = "Medium", sugar: Boolean = true) {
    println("Order: $size coffee, Sugar: ${if (sugar) "Yes" else "No"}")
}
