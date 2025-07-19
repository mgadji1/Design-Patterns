package expressions.implementations

import expressions.abstractClasses.MathExpression

class NumberExpression(private val number : String) : MathExpression() {
    override fun calculate() : Int {
        return number.toInt()
    }
}