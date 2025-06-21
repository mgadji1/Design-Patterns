class House {
    private var floor : String
    private var roof : String
    private var numberOfWindows : Int
    private var numberOfDoors : Int

    constructor(houseBuilder: HouseBuilder) {
        this.floor = houseBuilder.getFloor()
        this.roof = houseBuilder.getRoof()
        this.numberOfWindows = houseBuilder.getNumberOfWindows()
        this.numberOfDoors = houseBuilder.getNumberOfDoors()
    }

    fun getHouseInfo() {
        println("House info: \n" +
                "Floor: $floor \n" +
                "Roof: $roof \n" +
                "Number of windows: $numberOfWindows \n" +
                "Number of doors: $numberOfDoors")
    }
}