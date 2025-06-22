package repositories.abstractRepository

import nodes.abstractClasses.Node
import nodes.implementations.Directory
import nodes.implementations.File

abstract class Repository(protected val name : String) {
    private val content : MutableList<Node> = mutableListOf()

    fun addFile(file : File) {
        this.content.add(file)
    }

    fun addDirectory(directory : Directory) {
        this.content.add(directory)
    }

    abstract fun getInfo()

    abstract fun cloneRepository() : Repository
}