package org.example

fun main() {
    Logger.log("App started")
    Logger.log("User logged in")
}

object Logger {
    fun log(message: String) {
        println("[LOG] $message")
    }
}