package factories.implementations

import factories.interfaces.WorkerFactory
import job.implementations.Cook
import job.interfaces.Job
import salary.implementations.CookSalary
import salary.interfaces.Salary

class CookWorkerFactory : WorkerFactory {
    override fun getJob(): Job {
        return Cook()
    }

    override fun getSalary(): Salary {
        return CookSalary()
    }
}