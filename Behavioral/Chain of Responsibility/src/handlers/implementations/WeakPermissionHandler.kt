package handlers.implementations

import handlers.abstractClasses.PermissionHandler

class WeakPermissionHandler : PermissionHandler() {
    override val permissions = arrayOf("play music", "play game", "read article")
}