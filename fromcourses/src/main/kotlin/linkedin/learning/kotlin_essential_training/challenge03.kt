package linkedin.learning.kotlin_essential_training

import java.io.File

fun main() {
    val path = "./src/main/resources"

    val theFile = File("$path/foo.txt")
    val entries = mutableListOf<Double>()
    theFile.forEachLine {
        val entryAsDouble = it.toDoubleOrNull()
        if (entryAsDouble != null) {
            entries.add(entryAsDouble)
        }
    }

    entries.forEach { println(it) }
}