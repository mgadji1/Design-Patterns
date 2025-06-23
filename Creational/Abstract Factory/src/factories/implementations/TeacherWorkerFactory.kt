package factories.implementations

import factories.interfaces.WorkerFactory
import job.implementations.Teacher
import job.interfaces.Job
import salary.implementations.TeacherSalary
import salary.interfaces.Salary

class TeacherWorkerFactory : WorkerFactory {
    override fun getJob(): Job {
        return Teacher()
    }

    override fun getSalary(): Salary {
        return TeacherSalary()
    }
}