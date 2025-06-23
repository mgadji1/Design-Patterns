package nodes.abstractClasses

open class Node(protected val name : String) {
    fun getNodeName() : String {
        return this.name
    }
}