import nodes.implementations.Directory
import nodes.implementations.File

fun main() {
    val textFile = File("test.txt")
    val imageFile = File("image.png")

    val directory = Directory("files")

    directory.addNode(textFile)
    directory.addNode(imageFile)

    textFile.show()
    directory.show()
}