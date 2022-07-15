package linkedin.learning.kotlin_for_java_developers


fun <T: Comparable<T>> getSmaller(param1: T, param2: T): T {
    val result = param2.compareTo(param1)
    return if (result < 0) param2 else param1
}

fun main() {
    println("getSmaller")
    println("----------")

    val minInt: Int = getSmaller(42, 99)
    val minDouble: Double = getSmaller(9.887, 3.14159)
    val minString: String = getSmaller("kitten", "kittens")

    println("The min Int = $minInt")
    println("The min Double = $minDouble")
    println("The min String = $minString")
}