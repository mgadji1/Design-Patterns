class Calculator private constructor() {
    companion object {
        private var uniqueInstance : Calculator? = null

        fun getInstance() : Calculator {
            if (uniqueInstance == null) {
                uniqueInstance = Calculator()
            }
            return uniqueInstance!!
        }
    }

    fun add(firstNumber : Int, secondNumber : Int) : Int {
        return firstNumber + secondNumber
    }

    fun subtract(firstNumber : Int, secondNumber : Int) : Int {
        return firstNumber - secondNumber
    }

    fun multiply(firstNumber : Int, secondNumber : Int) : Int {
        return firstNumber * secondNumber
    }

    fun divide(firstNumber : Int, secondNumber : Int) : Int {
        if (secondNumber == 0) {
            throw ArithmeticException("Division by zero!")
        }
        return firstNumber / secondNumber
    }

    fun calculate(firstNumber : Int, secondNumber : Int, operation : (Int, Int) -> Int) : Int {
        val result = operation(firstNumber, secondNumber)
        return result
    }
}