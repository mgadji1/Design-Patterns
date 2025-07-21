package iterator.interfaces

interface Iterator<T> {
    fun hasNext() : Boolean
    fun next() : T?
}