package iterator.implementations

import container.implementations.LinkedList
import iterator.interfaces.Iterator

class LinkedListIterator<T>(
    private val linkedList : LinkedList<T>,
    private var index: Int = 0
) : Iterator<T> {
    override fun hasNext(): Boolean {
        return index < linkedList.getItems().size
    }

    override fun next(): T? {
        if (hasNext()) {
            return linkedList.getItems()[index++]
        }
        return null
    }
}