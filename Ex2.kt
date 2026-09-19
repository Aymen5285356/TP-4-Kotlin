package TP4

interface Animal {
    val name: String
    fun makeSound()
}

class Dog(override val name: String) : Animal {
    override fun makeSound() {
        println("$name says: Woof!")
    }
}

class Cat(override val name: String) : Animal {
    override fun makeSound() {
        println("$name says: Meow!")
    }
}

fun main() {
    val dog = Dog("Rex")
    val cat = Cat("Tom")

    dog.makeSound()
    cat.makeSound()
}