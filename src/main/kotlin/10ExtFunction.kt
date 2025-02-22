package org.example

fun main() {
    val price = 1000000
    println(price.toThaiBaht())
}

fun Int.toThaiBaht(): String = "%,d บาท".format(this)
