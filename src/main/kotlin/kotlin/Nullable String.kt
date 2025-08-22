fun printLength(str: String?) {
    if (str != null) {
        println("Length of string is: ${str.length}")
    } else {
        println("String is null")
    }
}

fun main() {
    val text1: String? = "Hello Kotlin"
    val text2: String? = null

    printLength(text1)
    printLength(text2)
}
