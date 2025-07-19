package interpreter

import expressions.implementations.NumberExpression
import expressions.implementations.PlusExpression

class Interpreter {
    fun interpret(expression : String) : Int {
        val expressionWithNoSpaces = expression.replace(" ", "")

        val numbers : MutableList<String> = expressionWithNoSpaces.split('+').toMutableList()

        for (i in 0 until numbers.size - 1) {
            val partialSum = (PlusExpression(
                NumberExpression(numbers[i]),
                NumberExpression(numbers[i + 1])
            )).calculate()
            numbers[i + 1] = partialSum.toString()
        }

        return numbers.last().toInt()
    }
}