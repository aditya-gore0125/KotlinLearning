

fun main() {
    print("Enter exam score: ")
    val score = readLine()?.toIntOrNull() ?: 0
    if (score > 90) {
        println("Excellent")
    } else if (score in 75..90) {
        println("Good")
    } else if (score in 50..74) {
        println("Satisfactory")
    } else {
        println("Fail")
    }
    val result = if (score > 90) {
        "Excellent"
    } else if (score in 75..90) {
        "Good"
    } else if (score in 50..74) {
        "satisfactory"
    } else {
        "Fail"
    }
    println("Result: $result")
}
