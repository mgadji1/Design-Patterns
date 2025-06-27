package professions

import dishes.abstractClasses.Dish

class Waiter {
    fun acceptOrder(order : List<Dish>) {
        println("The following order was accepted:")
        for (i in 0..order.size - 1) {
            println(order[i].name)
        }
    }
    fun deliverDish(dish : Dish) {
        println("The ${dish.name} was delivered")
    }
}