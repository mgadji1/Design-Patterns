package nodes.implementations

import nodes.abstractClasses.Node

class Directory(name : String) : Node(name) {
    private val content : MutableList<Node> = mutableListOf()

    fun addFile(file : File) {
        this.content.add(file)
    }

    fun addDirectory(directory: Directory) {
        this.content.add(directory)
    }
}