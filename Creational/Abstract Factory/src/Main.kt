import factories.implementations.CookWorkerFactory
import factories.implementations.ProgrammerWorkerFactory
import factories.implementations.TeacherWorkerFactory
import factories.interfaces.WorkerFactory

fun main() {
    val programmerWorkerFactory : WorkerFactory = ProgrammerWorkerFactory()

    val programmer = programmerWorkerFactory.getJob()
    val programmerSalary = programmerWorkerFactory.getSalary()

    programmer.getDescription()
    programmerSalary.getDescription()

    println()

    val cookWorkerFactory : WorkerFactory = CookWorkerFactory()

    val cook = cookWorkerFactory.getJob()
    val cookSalary = cookWorkerFactory.getSalary()

    cook.getDescription()
    cookSalary.getDescription()

    println()

    val teacherWorkerFactory : WorkerFactory = TeacherWorkerFactory()

    val teacher = teacherWorkerFactory.getJob()
    val teacherSalary = teacherWorkerFactory.getSalary()

    teacher.getDescription()
    teacherSalary.getDescription()
}