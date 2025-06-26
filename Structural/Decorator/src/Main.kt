import decorators.implementations.ChargerDecorator
import decorators.implementations.HeadPhonesDecorator
import phones.implementations.Samsung
import phones.implementations.iPhone
import phones.interfaces.Phone

fun main() {
    var iPhone : Phone = iPhone()

    println(iPhone.getCost())
    println(iPhone.getInfo())

    iPhone = ChargerDecorator(iPhone)

    println(iPhone.getCost())
    println(iPhone.getInfo())

    var samsung : Phone = Samsung()

    println(samsung.getCost())
    println(samsung.getInfo())

    samsung = HeadPhonesDecorator(samsung)

    println(samsung.getCost())
    println(samsung.getInfo())
}