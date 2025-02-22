package org.example

fun main() {
    val message = "Hello Kotlin World"
    println(message containsWord "kotlin")
    println(message containsWord "Java")
}

infix fun String.containsWord(word: String): Boolean = this.contains(word, ignoreCase = true)
