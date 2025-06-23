package widgets.implementations

import widgets.interfaces.Widget

class ElevatedButton(val text : String) : Widget {
    override fun getInfo() {
        println("ElevatedButton name: $text")
    }
}