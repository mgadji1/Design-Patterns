package nodes.implementations

import nodes.abstractClasses.Node

class Directory(name : String) : Node(name) {
    private val nodes : MutableList<Node> = mutableListOf()
    override fun show() {
        println("Directory: $name")
        for (i in 0..nodes.size - 1) {
            println("Node: ${nodes[i].name}")
        }
    }

    override fun addNode(node: Node) {
        nodes.add(node)
        println("Node with name ${node.name} was added to directory with name $name")
    }
}