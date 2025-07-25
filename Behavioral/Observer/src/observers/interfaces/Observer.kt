package observers.interfaces

import video.Video

interface Observer {
    fun onNewVideoPosted(video : Video)
}