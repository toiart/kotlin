package org.example

fun main() {
    Database.connect()

}

object Database {
    val name = "MainDB"

    fun connect() {
        println("Connected to $name")
    }
}
