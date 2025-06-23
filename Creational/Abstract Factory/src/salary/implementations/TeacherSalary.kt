package salary.implementations

import salary.interfaces.Salary

class TeacherSalary : Salary {
    override val salary: Int = 40_000
    override fun getDescription() {
        println("Teacher has salary: $salary dollars")
    }
}