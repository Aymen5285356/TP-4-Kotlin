package TP4

interface Vehicle {
    fun start()
    fun stop()
}

class Car : Vehicle {
    override fun start() {
        println("The car starts: vroom vroom!")
    }

    override fun stop() {
        println("The car stops.")
    }
}

class Bike : Vehicle {
    override fun start() {
        println("The bike starts: pedaling...")
    }

    override fun stop() {
        println("The bike stops: brakes on.")
    }
}

fun main() {
    val car = Car()
    val bike = Bike()

    car.start()
    car.stop()

    bike.start()
    bike.stop()
}