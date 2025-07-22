package mediator.interfaces

import user.abstractClasses.User

interface LibraryMediator {
    fun shareBook(name : String, user: User)
    fun addUser(user : User)
}