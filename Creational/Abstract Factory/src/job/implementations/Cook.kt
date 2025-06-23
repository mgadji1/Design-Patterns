package job.implementations

import job.interfaces.Job

class Cook : Job {
    override fun getDescription() {
        println("I am a cook")
    }
}