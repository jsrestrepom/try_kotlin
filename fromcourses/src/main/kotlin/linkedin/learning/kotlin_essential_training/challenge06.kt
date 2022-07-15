package linkedin.learning.kotlin_essential_training

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking
import java.io.File
import kotlin.system.measureTimeMillis


fun simpleReader() = readFile("the_whale.txt")

fun asyncReader() = runBlocking {
    val aDeferred: Deferred<List<String>> = async { readFile("the_whale.txt") }
    aDeferred.await().forEach { println(it) }
}

fun readFile(fileName: String): List<String> {
    val path = "./src/main/resources"
    val file = File("$path/$fileName")
    return file.readLines()
}

fun main() {
    val timeForSimpleReader = measureTimeMillis {
        simpleReader()
    }
    val timeForAsyncReader = measureTimeMillis {
        asyncReader()
    }

    println("timeForSimpleReader: $timeForSimpleReader ms")
    println("timeForAsyncReader: $timeForAsyncReader ms")
}