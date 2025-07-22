package mediator.implementations

import user.abstractClasses.User
import mediator.interfaces.LibraryMediator

class CustomLibraryMediator : LibraryMediator {
    private val users : MutableList<User> = mutableListOf()

    override fun shareBook(name: String, user: User) {
        for (i in 0 until users.size) {
            if (users[i] != user) {
                users[i].receive(name)
            }
        }
    }

    override fun addUser(user: User) {
        users.add(user)
    }
}