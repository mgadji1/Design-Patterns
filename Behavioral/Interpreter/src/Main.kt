import interpreter.Interpreter

fun main() {
    val expression = "2 + 3 + 5"

    val interpreter = Interpreter()

    val result = interpreter.interpret(expression)

    println("Result: $result")
}