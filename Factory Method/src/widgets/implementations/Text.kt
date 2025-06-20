package widgets.implementations

import widgets.interfaces.Widget

class Text(val text : String) : Widget {
    override fun getInfo() {
        println("Text name: $text")
    }
}