package factories.interfaces

import job.interfaces.Job
import salary.interfaces.Salary

interface WorkerFactory {
    fun getJob() : Job
    fun getSalary() : Salary
}