import desktops.implementations.WindowsDesktop
import proxy.SecuredDesktop

fun main() {
    val windowsSecuredDesktop = SecuredDesktop(WindowsDesktop())

    val password1 = "1234abcd56789"
    val password2 = "invalid"

    windowsSecuredDesktop.unlockDesktop(password1)
    windowsSecuredDesktop.unlockDesktop(password2)

    windowsSecuredDesktop.interactWithDesktop()
}