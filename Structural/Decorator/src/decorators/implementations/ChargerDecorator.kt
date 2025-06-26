package decorators.implementations

import decorators.abstractClasses.PhoneDecorator
import phones.interfaces.Phone

class ChargerDecorator(phone : Phone) : PhoneDecorator(phone) {
    override fun getCost(): Int {
        return super.getCost() + 1_000
    }

    override fun getInfo() : String {
        return "${phone.getInfo()} with charger"
    }
}