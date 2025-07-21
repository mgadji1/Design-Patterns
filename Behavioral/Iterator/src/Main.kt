import container.implementations.LinkedList

fun main() {
    val schoolSubjects = LinkedList<String>()

    schoolSubjects.add("Math")
    schoolSubjects.add("Physics")
    schoolSubjects.add("Chemistry")

    val iterator = schoolSubjects.createIterator()

    while (iterator.hasNext()) {
        println(iterator.next())
    }
}