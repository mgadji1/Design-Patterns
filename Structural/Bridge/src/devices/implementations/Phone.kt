package devices.implementations

import devices.abstractClasses.Device
import operatingSystems.interfaces.OperatingSystem

class Phone(operatingSystem: OperatingSystem) : Device(operatingSystem) {
    override fun activate() {
        println("Phone is activating")
        operatingSystem.launch()
    }
}