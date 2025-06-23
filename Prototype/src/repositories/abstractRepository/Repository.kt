package repositories.abstractRepository

import nodes.abstractClasses.Node
import nodes.implementations.Directory
import nodes.implementations.File

abstract class Repository(protected val name : String, private val content : MutableList<Node>) {

    fun addFile(file : File) {
        this.content.add(file)
    }

    fun addDirectory(directory : Directory) {
        this.content.add(directory)
    }

    abstract fun getInfo()

    abstract fun cloneRepository() : Repository

    fun showContent() {
        for (i in 0..this.content.size - 1) {
            println(this.content[i].getNodeName())
        }
    }

    fun getContent() : MutableList<Node> {
        return this.content
    }
}