import devices.implementations.Computer
import devices.implementations.Phone
import operatingSystems.implementations.Android
import operatingSystems.implementations.Linux
import operatingSystems.implementations.Windows

fun main() {
    val computerWithLinux = Computer(Linux())
    computerWithLinux.activate()

    val computerWithWindows = Computer(Windows())
    computerWithWindows.activate()

    val phoneWithAndroid = Phone(Android())
    phoneWithAndroid.activate()
}