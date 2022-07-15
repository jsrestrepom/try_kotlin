package linkedin.learning.kotlin_essential_training

fun replicate(func: (Int, String) -> Unit) {
    func(3, "Be Cool.")
}

fun main() {
    val asLambdaExpression: (Int, String) -> Unit = { times: Int, message: String -> println(message.repeat(times)) }
    replicate(asLambdaExpression)

    replicate { times: Int, message: String -> println(message.repeat(times)) }

    replicate(fun(times: Int, message: String) {
        println(message.repeat(times))
    })

    replicate { count, msg ->
        for (index in 1..count) {
            println(msg)
        }
    }
}
