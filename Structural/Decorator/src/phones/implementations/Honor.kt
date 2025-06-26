package phones.implementations

import phones.interfaces.Phone

class Honor : Phone {
    override fun getCost() : Int {
        return 50_000
    }

    override fun getInfo() : String {
        return "This is Honor"
    }
}