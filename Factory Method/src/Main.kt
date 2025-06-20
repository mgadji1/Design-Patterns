import layouts.abstractClass.Layout
import layouts.implementations.ButtonLayout
import layouts.implementations.TextLayout

fun main() {
    val buttonLayout : Layout = ButtonLayout()

    buttonLayout.produceAndPrintWidget("btn1")
    buttonLayout.produceAndPrintWidget("btn2")
    buttonLayout.produceAndPrintWidget("btn3")

    val textLayout : Layout = TextLayout()

    textLayout.produceAndPrintWidget("txt1")
    textLayout.produceAndPrintWidget("txt2")
    textLayout.produceAndPrintWidget("txt3")
}