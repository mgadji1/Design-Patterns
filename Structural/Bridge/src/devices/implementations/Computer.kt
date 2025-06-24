package devices.implementations

import devices.abstractClasses.Device
import operatingSystems.interfaces.OperatingSystem

class Computer(operatingSystem: OperatingSystem) : Device(operatingSystem) {
    override fun activate() {
        println("Computer is activating")
        operatingSystem.launch()
    }
}