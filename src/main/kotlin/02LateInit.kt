package org.example

fun main() {
    val baby = Baby()
    baby.born()
    baby.callBaby()
}

class Baby {
    lateinit var name: String
    fun born() {
        name = "Alice"
    }
    fun callBaby() {
        println(name)
    }
}
