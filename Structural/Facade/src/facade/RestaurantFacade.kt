package facade

import dishes.abstractClasses.Dish
import professions.Cook
import professions.Waiter

class RestaurantFacade(private val cook : Cook, private val waiter : Waiter) {
    fun makeOrder(order : List<Dish>) {
        waiter.acceptOrder(order)
        cook.prepareIngredients()
        for (i in 0..order.size - 1) {
            cook.cook(order[i])
            waiter.deliverDish(order[i])
        }
    }
}