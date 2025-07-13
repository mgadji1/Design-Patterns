package handlers.abstractClasses

abstract class PermissionHandler {
    private var upstreamHandler : PermissionHandler? = null
    protected open val permissions : Array<String> = arrayOf("any")

    fun setNextHandler(handler : PermissionHandler) {
        this.upstreamHandler = handler
    }

    fun handlePermission(permission : String) {
        if (this.permissions.contains(permission)) {
            println("Permission $permission was successfully handled")
        }
        else if (upstreamHandler != null) {
            println("Cannot handle permission $permission. " +
                    "Trying to pass it to the upstream handler")
            upstreamHandler?.handlePermission(permission)
        }
        else {
            println("No handler can handle permission $permission")
        }
    }
}