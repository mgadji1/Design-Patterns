package commands.implementations

import receiver.TV
import commands.interfaces.Command

class TurnOff(private val tv : TV) : Command {
    override fun execute() {
        tv.turnOff()
    }

    override fun undo() {
        tv.turnOn()
    }

    override fun redo() {
        execute()
    }
}