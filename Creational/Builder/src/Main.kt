fun main() {
    val floor = readLine()!!
    val roof = readLine()!!
    val numberOfWindows = readLine()!!.toInt()
    val numberOfDoors = readLine()!!.toInt()
    val house : House =
        HouseBuilder()
            .setFloor(floor)
            .setRoof(roof)
            .setNumberOfWindows(numberOfWindows)
            .setNumberOfDoors(numberOfDoors)
            .build()
    house.getHouseInfo()
}