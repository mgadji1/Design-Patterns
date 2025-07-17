import commands.implementations.*
import commands.interfaces.Command
import controller.RemoteControl
import receiver.TV

fun main() {
    val tv = TV()

    val turnOn : Command = TurnOn(tv)
    val turnOff : Command = TurnOff(tv)
    val watchMovie : Command = WatchMovie(tv)
    val stopMovie : Command = StopMovie(tv)
    val increaseVolume : Command = IncreaseVolume(tv)
    val decreaseVolume : Command = DecreaseVolume(tv)

    val remoteControl = RemoteControl()

    remoteControl.submit(turnOn)
    remoteControl.submit(watchMovie)
    remoteControl.submit(increaseVolume)

    remoteControl.submit(decreaseVolume)
    remoteControl.submit(stopMovie)
    remoteControl.submit(turnOff)
}