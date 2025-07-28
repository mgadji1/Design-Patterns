package textEditor

import memento.Memento

class TextEditor {
    private var text = ""

    fun type(text : String) {
        this.text += text
    }

    fun getText() : String {
        return text
    }

    fun save() : Memento {
        return Memento(text)
    }

    fun restore(memento: Memento) {
        text = memento.getState()
    }
}