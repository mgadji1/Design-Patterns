package job.implementations

import job.interfaces.Job

class Programmer : Job {
    override fun getDescription() {
        println("I am a programmer")
    }
}