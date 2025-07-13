import handlers.implementations.MediumPermissionHandler
import handlers.implementations.StrongPermissionHandler
import handlers.implementations.WeakPermissionHandler

fun main() {
    val weakPermissionHandler = WeakPermissionHandler()
    val mediumPermissionHandler = MediumPermissionHandler()
    val strongPermissionHandler = StrongPermissionHandler()

    weakPermissionHandler.setNextHandler(mediumPermissionHandler)
    mediumPermissionHandler.setNextHandler(strongPermissionHandler)

    val weakRequest = "play game"
    val mediumRequest = "download app"
    val strongRequest = "delete system"
    val unknownRequest = "throw away the computer"

    weakPermissionHandler.handlePermission(weakRequest)
    weakPermissionHandler.handlePermission(mediumRequest)
    weakPermissionHandler.handlePermission(strongRequest)
    weakPermissionHandler.handlePermission(unknownRequest)
}