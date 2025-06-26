package phones.implementations

import phones.interfaces.Phone

class iPhone : Phone {
    override fun getCost() : Int {
        return 100_000
    }

    override fun getInfo() : String {
        return "This is iPhone"
    }
}