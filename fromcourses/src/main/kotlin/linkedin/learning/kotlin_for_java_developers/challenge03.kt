package linkedin.learning.kotlin_for_java_developers

class Cubic(val x: Int, val y: Int, val z: Int) {
    operator fun plus(other: Cubic): Cubic {
        return Cubic(x + other.x, y + other.y, z + other.z)
    }

    operator fun minus(other: Cubic): Cubic {
        return Cubic(x - other.x, y - other.y, z - other.z)
    }

    override fun toString(): String {
        return "($x, $y, $z)"
    }
}


fun main() {
    println("operator")
    println("----------")

    val pt1 = Cubic(100, 200, 300)
    val pt2 = Cubic(10, 20, 30)

    println("pt1 = $pt1")
    println("pt2 = $pt2")
    println("pt1 + pt2 = ${pt1 + pt2}")
    println("pt1 - pt2 = ${pt1 - pt2}")
}