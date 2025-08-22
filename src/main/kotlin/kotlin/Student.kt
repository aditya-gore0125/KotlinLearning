
class Student(val name: String, val roll: Int, val marks: Int) {

    fun grade(): String {
        return if (marks >= 75) {
            "A"
        } else if (marks >= 50) {
            "B"
        } else {
            "C"
        }
    }
}
fun main() {
    val s1 = Student("Aditya", 125, 85)
    val s2 = Student("samarth", 128, 65)
    val s3 = Student("kunal", 126, 40)
    println("${s1.name} got grade: ${s1.grade()}")
    println("${s2.name} got grade: ${s2.grade()}")
    println("${s3.name} got grade: ${s3.grade()}")
}