class HouseBuilder {
    private var floor : String = ""
    private var roof : String = ""
    private var numberOfWindows : Int = 0
    private var numberOfDoors : Int = 0

    fun setFloor(floor : String) : HouseBuilder {
        this.floor = floor
        return this
    }

    fun setRoof(roof : String) : HouseBuilder {
        this.roof = roof
        return this
    }

    fun setNumberOfWindows(numberOfWindows : Int) : HouseBuilder {
        this.numberOfWindows = numberOfWindows
        return this
    }

    fun setNumberOfDoors(numberOfDoors : Int) : HouseBuilder {
        this.numberOfDoors = numberOfDoors
        return this
    }

    fun getFloor() : String {
        return this.floor
    }

    fun getRoof() : String {
        return this.roof
    }

    fun getNumberOfWindows() : Int {
        return this.numberOfWindows
    }

    fun getNumberOfDoors() : Int {
        return this.numberOfDoors
    }

    fun build() : House {
        return House(this)
    }
}