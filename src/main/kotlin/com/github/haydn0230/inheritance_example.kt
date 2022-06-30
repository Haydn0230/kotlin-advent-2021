package com.github.haydn0230

fun main(args:Array<String>) {
    val blackBird = Bird()
    val hawk = Hawk()
    blackBird.fly()
    hawk.fly()
}

// open key word allows us to override the functionality in the hawk class
open class Bird {
    val colour = "blue"
    open fun fly():Unit {
        println("bird of colour $colour currently at 51mph")
    }
}

// override keyword required to override super class functionality
class Hawk: Bird() {
    val eyesight = "very good"
    override fun fly():Unit {
        println("Hawk of $colour flying very high but it can still see you as eyesight is $eyesight")
    }
}


