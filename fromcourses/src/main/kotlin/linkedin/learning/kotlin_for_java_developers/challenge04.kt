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

    println("The oldest student is ${students.maxBy { it.age }}")

    val studentsWithLongNames = students.filter { it.name.length > 5 }
    println("Long names: $studentsWithLongNames")

    println("The student first student with the shortest name is ${students.minBy { it.name.length }}")

    val studentWithShortestName = students.minByOrNull { it.name.length }
    if (studentWithShortestName != null) {
        val studentsShortsNames = students.filter { it.name.length == studentWithShortestName.name.length }
        println("Short names: $studentsShortsNames")
    }
}