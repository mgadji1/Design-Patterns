package decorators.abstractClasses

import phones.interfaces.Phone

abstract class PhoneDecorator(protected val phone : Phone) : Phone {
    override fun getCost(): Int {
        return phone.getCost()
    }

    override fun getInfo() : String {
        return phone.getInfo()
    }
}