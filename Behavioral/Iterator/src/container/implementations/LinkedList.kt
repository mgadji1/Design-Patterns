package container.implementations

import iterator.implementations.LinkedListIterator
import container.interfaces.Collection
import iterator.interfaces.Iterator

class LinkedList<T> : Collection<T> {
    private val items : MutableList<T> = mutableListOf()

    fun add(item : T) {
        items.add(item)
    }

    fun getItems() : MutableList<T> {
        return items
    }

    override fun createIterator() : Iterator<T> {
        return LinkedListIterator(this)
    }
}