package devices.abstractClasses

import operatingSystems.interfaces.OperatingSystem

abstract class Device(protected val operatingSystem : OperatingSystem) {
    abstract fun activate()
}