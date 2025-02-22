package org.example

fun main() {
    val config by lazy { loadConfig() }
    println(config)
    println(config)
}

fun loadConfig(): String {
    println("load config from server 1")
    println("load config from server 2")
    return "Configuration"
}