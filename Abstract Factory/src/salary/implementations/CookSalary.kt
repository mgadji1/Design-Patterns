package salary.implementations

import salary.interfaces.Salary

class CookSalary : Salary {
    override val salary: Int = 60_000
    override fun getDescription() {
        println("Cook has salary: $salary dollars")
    }
}