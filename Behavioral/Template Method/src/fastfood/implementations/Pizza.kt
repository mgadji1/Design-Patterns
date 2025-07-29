package fastfood.implementations

import fastfood.abstractClasses.FastFood

class Pizza : FastFood() {
    override fun prepareDough() {
        println("Preparing round cake")
    }

    override fun addIngredients() {
        println("Adding sausage, cheese, tomato, lettuce, ketchup")
    }
}