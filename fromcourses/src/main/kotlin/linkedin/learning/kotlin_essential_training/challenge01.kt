package linkedin.learning.kotlin_essential_training


fun main() {
    var cardPoints = 7_000

    val cardLevel: String = if (cardPoints >= 1000 && cardPoints < 1000) {
        "pearl"
    } else if (cardPoints >= 1000 && cardPoints < 5_000) {
        "silver"
    } else if (cardPoints >= 5_000 && cardPoints < 10_000) {
        "gold"
    } else {
        "platinum"
    }

    val plural = if (cardPoints > 1 || cardPoints == 0) "s" else ""
    println("You have $cardPoints point$plural and are at the $cardLevel level.")
}