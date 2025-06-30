package proxy

import desktops.interfaces.Desktop

class SecuredDesktop(private val desktop: Desktop) : Desktop {
    private val password = "1234abcd56789"
    override fun unlockDesktop(password: String) {
        if (authenticate(password)) {
            desktop.unlockDesktop("")
        }
        else {
            println("Invalid password")
        }
    }

    override fun interactWithDesktop() {
        desktop.interactWithDesktop()
    }

    private fun authenticate(password: String) : Boolean {
        return this.password == password
    }
}