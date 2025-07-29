import fastfood.abstractClasses.FastFood
import fastfood.implementations.Burger
import fastfood.implementations.Pizza

fun main() {
    val burger : FastFood = Burger()

    burger.prepareDish()

    val pizza : FastFood = Pizza()

    pizza.prepareDish()
}