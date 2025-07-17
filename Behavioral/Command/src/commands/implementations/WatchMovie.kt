package commands.implementations

import receiver.TV
import commands.interfaces.Command

class WatchMovie(private val tv : TV) : Command {
    override fun execute() {
        tv.watchMovie()
    }

    override fun undo() {
        tv.stopMovie()
    }

    override fun redo() {
        execute()
    }
}