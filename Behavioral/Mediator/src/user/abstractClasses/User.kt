package user.abstractClasses

import mediator.interfaces.LibraryMediator

abstract class User(
    protected val libraryMediator: LibraryMediator,
    val name : String
) {
    abstract fun share(name : String)
    abstract fun receive(name : String)
}