package commands.implementations

import receiver.TV
import commands.interfaces.Command

class StopMovie(private val tv : TV) : Command {
    override fun execute() {
        tv.stopMovie()
    }

    override fun undo() {
        tv.watchMovie()
    }

    override fun redo() {
        execute()
    }
}