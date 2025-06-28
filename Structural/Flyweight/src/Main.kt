import factory.WorkerFactory
import kotlin.random.Random

fun main() {
    val professions = listOf("Doctor", "Teacher", "IT-specialist", "Security Guard")

    val random : Random = Random(10)

    for (i in 1..3) {
        val worker = WorkerFactory.getWorker(getRandomProfession(professions, random))
        worker.work()
        worker.getSalary()
    }
}

fun getRandomProfession(professions : List<String>, random : Random) : String {
    return professions[random.nextInt(0, professions.size - 1)]
}