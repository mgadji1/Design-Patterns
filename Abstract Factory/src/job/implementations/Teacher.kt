package job.implementations

import job.interfaces.Job

class Teacher : Job {
    override fun getDescription() {
        println("I am a teacher")
    }
}