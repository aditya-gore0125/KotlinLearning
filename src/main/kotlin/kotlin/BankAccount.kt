
open class BankAccount(val accountHolder: String, val bankName: String) {
    private var balance: Double = 0.0   // private variable

    protected fun showBalance() {       // protected function
        println("Balance = $balance")
    }
    fun deposit(amount: Double) {
        balance += amount
    }
    fun withdraw(amount: Double) {
        if (amount <= balance) {
            balance -= amount
        } else {
            println("Not enough money")
        }
    }
}
class SavingsAccount(accountHolder: String, bankName: String)
    : BankAccount(accountHolder, bankName) {

    fun check() {
        showBalance()   // calling protected function
    }
}
fun main() {
    val acc = SavingsAccount("Aditya", "SBI")
    acc.deposit(1000.0)
    acc.withdraw(200.0)
    acc.check()
}


