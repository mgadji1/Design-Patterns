package factory

import workers.implementations.ConcreteWorker
import workers.interfaces.Worker
import kotlin.random.Random

class WorkerFactory {
    companion object {
        private val workers : HashMap<String, Worker> = HashMap()

        private val random : Random = Random(0)

        fun getWorker(profession : String) : Worker {
            var worker = workers[profession]

            if (worker == null) {
                worker = ConcreteWorker(profession, random.nextInt(10, 100))
                workers[profession] = worker
                println("New worker was created")
            }
            return worker
        }
    }
}