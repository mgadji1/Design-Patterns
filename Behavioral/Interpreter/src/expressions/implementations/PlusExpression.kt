package expressions.implementations

import expressions.abstractClasses.MathExpression

class PlusExpression(
    private val leftOperand : MathExpression,
    private val rightOperand : MathExpression
) : MathExpression() {
    override fun calculate(): Int {
        return leftOperand.calculate() + rightOperand.calculate()
    }
}