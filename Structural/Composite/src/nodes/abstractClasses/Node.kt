package nodes.abstractClasses

abstract class Node(val name : String) {
    abstract fun show()
    abstract fun addNode(node : Node)
}