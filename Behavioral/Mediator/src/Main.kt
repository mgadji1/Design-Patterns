import mediator.implementations.CustomLibraryMediator
import user.implementations.ConcreteUser

fun main() {
    val libraryMediator = CustomLibraryMediator()

    val user1 = ConcreteUser(libraryMediator, "Bob")
    val user2 = ConcreteUser(libraryMediator, "Mark")
    val user3 = ConcreteUser(libraryMediator, "Alice")
    val user4 = ConcreteUser(libraryMediator, "Carl")

    libraryMediator.addUser(user1)
    libraryMediator.addUser(user2)
    libraryMediator.addUser(user3)
    libraryMediator.addUser(user4)

    user1.share("The Little Prince")
}