package operatingSystems.implementations

import operatingSystems.interfaces.OperatingSystem

class Android : OperatingSystem {
    override fun launch() {
        println("Android is launching")
    }
}