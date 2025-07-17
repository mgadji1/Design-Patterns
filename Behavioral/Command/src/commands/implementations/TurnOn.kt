package commands.implementations

import receiver.TV
import commands.interfaces.Command

class TurnOn(private val tv : TV) : Command {
    override fun execute() {
        tv.turnOn()
    }

    override fun undo() {
        tv.turnOff()
    }

    override fun redo() {
        execute()
    }
}