package layouts.implementations

import widgets.implementations.Text
import widgets.interfaces.Widget
import layouts.abstractClass.Layout

class TextLayout : Layout() {
    override fun createWidget(text : String): Widget {
        return Text(text)
    }
}