fun main() {
    val firstNumber = readLine().toString().toInt()
    val secondNumber = readLine().toString().toInt()

    val calculator = Calculator.getInstance()

    val addition = calculator
        .calculate(firstNumber, secondNumber, calculator::add)
    println("Addition result: $addition")

    val subtraction = calculator
        .calculate(firstNumber, secondNumber, calculator::subtract)
    println("Subtraction result: $subtraction")

    val multiplication = calculator
        .calculate(firstNumber, secondNumber, calculator::multiply)
    println("Multiplication result: $multiplication")

    val division = calculator
        .calculate(firstNumber, secondNumber, calculator::divide)
    println("Division result: $division")
}