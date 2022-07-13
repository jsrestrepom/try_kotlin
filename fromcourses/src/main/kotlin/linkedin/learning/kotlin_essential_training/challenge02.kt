package linkedin.learning.kotlin_essential_training

fun main() {
    val animals =
        listOf("apple", "biscuit", "apple", "cat", "cat", "cat", "dog", "elephant", "fox", "goat", "elephant")

    removeDuplicatesWithSet(animals)
    removeDuplicatesOldFashionWay(animals)
}

fun removeDuplicatesWithSet(items: List<String>) {
    val result = items.toSet()
    println(result)
}

fun removeDuplicatesOldFashionWay(items: List<String>) {
    val result = mutableListOf<String>()
    for (item in items) {
        if (!result.contains(item)) {
            result.add(item)
        }
    }
    println(result)
}
