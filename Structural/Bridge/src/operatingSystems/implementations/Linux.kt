package operatingSystems.implementations

import operatingSystems.interfaces.OperatingSystem

class Linux : OperatingSystem {
    override fun launch() {
        println("Linux is launching")
    }
}