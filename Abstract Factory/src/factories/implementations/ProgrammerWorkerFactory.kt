package factories.implementations

import factories.interfaces.WorkerFactory
import job.implementations.Programmer
import job.interfaces.Job
import salary.implementations.ProgrammerSalary
import salary.interfaces.Salary

class ProgrammerWorkerFactory : WorkerFactory {
    override fun getJob(): Job {
        return Programmer()
    }

    override fun getSalary(): Salary {
        return ProgrammerSalary()
    }
}