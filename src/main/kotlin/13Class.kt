package org.example

fun main() {
    val person = Person().apply {
        name = "Alice"
        age = 25
    }
    with(person) {
        introduce()
    }

    // with constructor
    val house = House("green", 4)
    house.describeHouse()

}

class Person {
    var name: String = "Unknown"
    var age: Int = 0
    init {
        println("Person created: $name, Age: $age")
    }

    fun introduce() {
        println("Hi, my name is $name and I'm $age years old.")
    }
}

class House(val color: String, val numRooms: Int) {
    fun getNumberOfRooms(): Int = numRooms
    fun describeHouse() = println("House $color with $numRooms rooms.")
}
