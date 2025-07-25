package youtube.interfaces

import observers.interfaces.Observer
import video.Video

interface Observable {
    fun attach(observer: Observer)
    fun detach(observer: Observer)
    fun notifyObservers(video : Video)
}