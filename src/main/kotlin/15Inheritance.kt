package org.example

fun main() {
    val car = ElectricVehicle("BYD", "Seal")
    car.startEngine()
    car.honk()
}

open class Vehicle(val brand: String) {
    fun startEngine() {
        println("$brand engine started!")
    }
}

class ElectricVehicle(brand: String, val model: String) : Vehicle(brand) {
    fun honk() {
        println("$brand $model honks! Beep Beep!")
    }
}