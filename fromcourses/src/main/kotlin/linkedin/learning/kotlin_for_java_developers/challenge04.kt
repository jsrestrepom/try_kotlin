package linkedin.learning.kotlin_for_java_developers

data class Student(val name: String, var age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Ginger", 19),
        Student("Michael", 23),
        Student("Maria", 20),
        Student("Joe", 19),
        Student("Bob", 16)
    )
}

fun main() {
    val students = getStudents()

    val combos = students.map{ s -> s.name + ":" + s.age}
    println("Combos: $combos")

    println("The oldest student is ")

    println("Long names: ")

    println("The student with the shortest name is ")

    println("Short names: ")
}