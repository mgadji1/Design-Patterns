package desktops.implementations

import desktops.interfaces.Desktop

class WindowsDesktop : Desktop {
    override fun unlockDesktop(password: String) {
        println("Desktop is unlocked")
    }

    override fun interactWithDesktop() {
        println("Interacting with the desktop")
    }
}