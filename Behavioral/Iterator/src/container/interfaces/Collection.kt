package container.interfaces

import iterator.interfaces.Iterator

interface Collection<T> {
    fun createIterator() : Iterator<T>
}