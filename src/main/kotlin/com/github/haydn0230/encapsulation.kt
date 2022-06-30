package com.github.haydn0230

data class Burger (
    val meat: String,
    val sesameSeeds: Boolean,
    val salad: Boolean
    )

class BurgerFranchise {

    fun MakeBurgers(): Burger = CreateBurger()

    private fun CreateBurger(): Burger = Burger(meat = "chicken", sesameSeeds = true, salad = true)
}


fun main(args:Array<String>) {
    val burgerJoint = BurgerFranchise()
    burgerJoint.MakeBurgers()
}
