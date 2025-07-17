package controller

import commands.interfaces.Command

class RemoteControl {
    fun submit(command : Command) {
        command.execute()
    }
}