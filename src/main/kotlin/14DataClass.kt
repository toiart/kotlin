package org.example

fun main() {
    val user1 = User("Eve", 26)
    val user2 = User("Eva", 26)
    println(user1 == user2)

    val user3 = user2.copy(age = 25)
    println(user3)
}

data class User(val name: String, val age: Int)
