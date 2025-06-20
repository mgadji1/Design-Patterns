package layouts.implementations

import widgets.implementations.ElevatedButton
import widgets.interfaces.Widget
import layouts.abstractClass.Layout

class ButtonLayout : Layout() {
    override fun createWidget(text : String): Widget {
        return ElevatedButton(text)
    }
}