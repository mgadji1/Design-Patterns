package salary.implementations

import salary.interfaces.Salary

class ProgrammerSalary : Salary {
    override val salary: Int = 100_000
    override fun getDescription() {
        println("Programmer has salary: $salary dollars")
    }
}