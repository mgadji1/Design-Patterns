package operatingSystems.implementations

import operatingSystems.interfaces.OperatingSystem

class Windows : OperatingSystem {
    override fun launch() {
        println("Windows is launching")
    }
}