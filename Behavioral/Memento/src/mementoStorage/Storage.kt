package mementoStorage

import memento.Memento

class Storage {
    private val mementoList = mutableListOf<Memento>()

    fun addMemento(memento: Memento) {
        mementoList.add(memento)
    }

    fun getMemento(index : Int) : Memento {
        return mementoList[index]
    }
}