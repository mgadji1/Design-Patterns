package professions

import dishes.abstractClasses.Dish

class Cook {
    fun prepareIngredients() {
        println("All ingredients were prepared")
    }
    fun cook(dish : Dish) {
        println("The ${dish.name} was prepared")
    }
}