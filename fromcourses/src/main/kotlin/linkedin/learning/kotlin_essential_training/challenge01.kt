package linkedin.learning.kotlin_essential_training


fun readCardPointsFromInput(): Int {
    print("Enter points: ")
    val input = readLine() ?: ""
    return input.toIntOrNull() ?: 0
}

fun main() {
    val cardPoints = readCardPointsFromInput()

    val cardLevel: String = when (cardPoints) {
        in 0..999 -> "pearl"
        in 1000 .. 4_999 -> "silver"
        in 5_000 .. 9_999 -> "gold"
        else -> "platinum"
    }

    val plural = if (cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")
}