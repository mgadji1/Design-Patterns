package nodes.implementations

import nodes.abstractClasses.Node

class File(name : String) : Node(name) {
    override fun show() {
        println("File: $name")
    }

    override fun addNode(node: Node) {
        throw UnsupportedOperationException("File cannot contain another file")
    }
}