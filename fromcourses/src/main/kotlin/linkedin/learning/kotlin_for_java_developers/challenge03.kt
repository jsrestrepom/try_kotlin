package linkedin.learning.kotlin_for_java_developers

fun main() {
    println("operator")

    val pt1 = Cubic(100, 200, 300)
    val pt2 = Cubic(10, 20, 30)

    println("pt1 = $pt1")
    println("pt2 = $pt2")
    println("pt1 + pt2 = ${pt1 + pt2}")
    println("pt1 - pt2 = ${pt1 - pt2}")
}