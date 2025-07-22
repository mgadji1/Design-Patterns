package user.implementations

import mediator.interfaces.LibraryMediator
import user.abstractClasses.User

class ConcreteUser(
    libraryMediator: LibraryMediator,
    name : String
) : User(libraryMediator, name) {
    override fun share(name : String) {
        println("${this.name} shares with book $name")
        libraryMediator.shareBook(name, this)
    }

    override fun receive(name: String) {
        println("${this.name} receives book $name")
    }
}