package fastfood.abstractClasses

abstract class FastFood {
    fun prepareDish() {
        prepareDough()
        addIngredients()
        warmUp()
        serveDish()
    }

    protected abstract fun prepareDough()
    protected abstract fun addIngredients()

    private fun warmUp() {
        println("Warming up the dish")
    }

    private fun serveDish() {
        println("Serving the dish")
    }
}