package workers.implementations

import workers.interfaces.Worker

class ConcreteWorker(private val profession : String, private val salary : Int)
    : Worker {
    override fun work() {
        println("I am a $profession")
    }

    override fun getSalary() {
        println("I get $salary working as a $profession")
    }
}