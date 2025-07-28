import mementoStorage.Storage
import textEditor.TextEditor

fun main() {
    val textEditor = TextEditor()

    val storage = Storage()

    textEditor.type("Hello")
    storage.addMemento(textEditor.save())

    textEditor.type("World")
    storage.addMemento(textEditor.save())

    textEditor.restore(storage.getMemento(0))
    println("First saved text: ${textEditor.getText()}")

    textEditor.restore(storage.getMemento(1))
    println("Second saved text: ${textEditor.getText()}")
}