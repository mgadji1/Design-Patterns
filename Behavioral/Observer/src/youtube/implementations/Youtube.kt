package youtube.implementations

import observers.interfaces.Observer
import video.Video
import youtube.interfaces.Observable

class Youtube : Observable {
    private val observers : MutableList<Observer> = mutableListOf()

    override fun attach(observer: Observer) {
        observers.add(observer)
    }

    override fun detach(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObservers(video: Video) {
        for (observer in observers) {
            observer.onNewVideoPosted(video)
        }
    }

    fun addVideo(video : Video) {
        notifyObservers(video)
    }
}