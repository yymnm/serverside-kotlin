fun main() {
    println("Hello, World")

    printText()

    val id = 100
    var name = "yymnm"
//    id = 200 compile error

    val user = User()
    user.name
}

fun printText() {
    val text = "Kotlin"
    println(text)
}

fun countLength(str: String): Int {
    return str.length
}

fun whenExample(num: Int) {
    when(num) {
        100 -> {
            println("100")
        }

        else -> {
            println("invalid number")
        }
    }
}