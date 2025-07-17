package commands.implementations

import receiver.TV
import commands.interfaces.Command

class DecreaseVolume(private val tv : TV) : Command {
    override fun execute() {
        tv.decreaseVolume()
    }

    override fun undo() {
        tv.increaseVolume()
    }

    override fun redo() {
        execute()
    }
}