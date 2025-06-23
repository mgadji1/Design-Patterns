package layouts.abstractClass

import widgets.interfaces.Widget

abstract class Layout {
    protected abstract fun createWidget(text : String) : Widget

    fun produceAndPrintWidget(text : String) {
        val widget = createWidget(text)
        widget.getInfo()
    }
}