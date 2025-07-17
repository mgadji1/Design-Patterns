package commands.interfaces

interface Command {
    fun execute()
    fun undo()
    fun redo()
}