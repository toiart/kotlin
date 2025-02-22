package org.example

fun main() {
    println(getUserName("Alice"))
    println(getUserName(null))
}

fun getUserName(name: String?): String {
    return name?.uppercase() ?: "Unknown User"
}