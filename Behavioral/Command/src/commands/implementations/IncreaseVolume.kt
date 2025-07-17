package commands.implementations

import receiver.TV
import commands.interfaces.Command

class IncreaseVolume(private val tv : TV) : Command {
    override fun execute() {
        tv.increaseVolume()
    }

    override fun undo() {
        tv.decreaseVolume()
    }

    override fun redo() {
        execute()
    }
}