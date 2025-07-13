package handlers.implementations

import handlers.abstractClasses.PermissionHandler

class MediumPermissionHandler : PermissionHandler() {
    override val permissions = arrayOf("change configuration", "download app", "use VPN")
}