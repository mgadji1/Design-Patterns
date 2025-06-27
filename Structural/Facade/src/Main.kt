import dishes.implementations.Burger
import dishes.implementations.Pizza
import facade.RestaurantFacade
import professions.Cook
import professions.Waiter

fun main() {
    val cook = Cook()
    val waiter = Waiter()

    val restaurantFacade = RestaurantFacade(cook, waiter)

    val pepperoni = Pizza("Pepperoni")
    val margherita = Pizza("Margherita")

    val cheeseBurger = Burger("Cheeseburger")
    val chickenBurger = Burger("Chicken Burger")

    val order = listOf(pepperoni, margherita, cheeseBurger, chickenBurger)

    restaurantFacade.makeOrder(order)
}