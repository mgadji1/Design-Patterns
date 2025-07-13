package handlers.implementations

import handlers.abstractClasses.PermissionHandler

class StrongPermissionHandler : PermissionHandler() {
    override val permissions = arrayOf("delete system", "install another system", "change system files")
}