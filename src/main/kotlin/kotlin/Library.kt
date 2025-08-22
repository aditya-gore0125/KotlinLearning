
data class Book(val title: String, val author: String, val price: Double)

class Library(val books: List<Book>) {
    fun showBooks() {
        for (b in books) {
            println("${b.title} by ${b.author} - Rs.${b.price}")
        }
    }
}

fun main() {
    val library = Library(
        listOf(
            Book("WINGS OF FIRE", "Author1", 250.0),
            Book("STUBLE ART OF NOT GIVING A F*CK", "Author2", 300.0),
            Book("INTRODUCTION TO ALGORITHMS", "Author3", 550.0)
        )
    )
    library.showBooks()
}
