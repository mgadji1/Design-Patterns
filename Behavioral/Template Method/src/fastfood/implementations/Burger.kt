package fastfood.implementations

import fastfood.abstractClasses.FastFood

class Burger : FastFood() {
    override fun prepareDough() {
        println("Preparing two buns")
    }

    override fun addIngredients() {
        println("Adding cutlet, cheese, tomato, cucumber, lettuce, ketchup")
    }
}