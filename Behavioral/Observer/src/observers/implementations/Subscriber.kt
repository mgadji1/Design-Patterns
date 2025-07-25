package observers.implementations

import video.Video
import observers.interfaces.Observer

class Subscriber(private val name : String) : Observer {
    override fun onNewVideoPosted(video: Video) {
        println("Hi, $name! Do not miss new video: ${video.getTitle()}")
    }
}