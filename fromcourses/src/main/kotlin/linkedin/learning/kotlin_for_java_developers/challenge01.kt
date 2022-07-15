package linkedin.learning.kotlin_for_java_developers


fun ifFizzBuzz() {
    for (number in 1..105) {
        val answer = if (number % 3 == 0 && number % 5 == 0) {
            "fizz buzz"
        } else if (number % 3 == 0) {
            "fizz"
        } else if (number % 5 == 0) {
            "buzz"
        } else {
            ""
        }
        println("($number) $answer")
    }
}

fun whenFizzBuzz() {
    for (number in 1..105) {
        val answer = when {
            number % 3 == 0 && number % 5 == 0 -> "fizz buzz"
            number % 3 == 0 -> "fizz"
            number % 5 == 0 -> "buzz"
            else -> ""
        }
        println("($number) $answer")
    }
}

fun main() {
    println("Fizz Buzz")
    println("----------")

    ifFizzBuzz()
    println("----------")
    whenFizzBuzz()

}