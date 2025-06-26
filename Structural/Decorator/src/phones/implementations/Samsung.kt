package phones.implementations

import phones.interfaces.Phone

class Samsung : Phone {
    override fun getCost() : Int {
        return 30_000
    }

    override fun getInfo() : String {
        return "This is Samsung"
    }
}