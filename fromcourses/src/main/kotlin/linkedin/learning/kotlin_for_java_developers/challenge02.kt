package linkedin.learning.kotlin_for_java_developers

fun main() {
    println("getSmaller")

    val minInt: Int = getSmaller(42, 99)
    val minDouble: Double = getSmaller(9.887, 3.14159)
    val minString: String = getSmaller("kitten", "kittens")

    println("The min Int = $minInt")
    println("The min Double = $minDouble")
    println("The min String = $minString")
}