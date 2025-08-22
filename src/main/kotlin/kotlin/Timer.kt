// Assignment 3


fun main() {
    var restart: String
    do {
        var num = 10
        while (num >= 1) {
            println(num)
            num--
            Thread.sleep(500) // small delay for effect
        }
        print("Do you want to restart countdown? (yes/no): ")
        restart = readLine()?.lowercase() ?: "no"
    } while (restart == "yes")
}
