import observers.implementations.Subscriber
import video.Video
import youtube.implementations.Youtube

fun main() {
    val subscriber1 = Subscriber("Mark")
    val subscriber2 = Subscriber("Bob")
    val subscriber3 = Subscriber("Alice")

    val youtube = Youtube()

    youtube.attach(subscriber1)
    youtube.attach(subscriber2)
    youtube.attach(subscriber3)

    val video1 = Video("The best programming language is ...")

    youtube.addVideo(video1)

    youtube.detach(subscriber2)

    val video2 = Video("How to drink water?")

    youtube.addVideo(video2)
}