package decorators.implementations

import decorators.abstractClasses.PhoneDecorator
import phones.interfaces.Phone

class HeadPhonesDecorator(phone : Phone) : PhoneDecorator(phone) {
    override fun getCost(): Int {
        return super.getCost() + 10_000
    }

    override fun getInfo() : String {
        return "${phone.getInfo()} with headphones"
    }
}