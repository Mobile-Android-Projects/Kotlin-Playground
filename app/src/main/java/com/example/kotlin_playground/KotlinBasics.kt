package com.example.kotlin_playground

fun main() {
    //let's create an instance of the BankAccount class
    //and pass a ref to it on the heap to a immutable variable
    val account1: BankAccount = BankAccount(7171, 700000.0)
    val account2: SavingsAccount = SavingsAccount(7171, 7000000.0, "Mbatia",0.11)
    account2.displayBalance()
    println("Interest earned on Account: ${account2.calculateInterest()}")
}

open class BankAccount(val accountNumber: Int, var accountBalance: Double) {
    var lastName: String = ""
    val fees: Double = 25.00

    constructor(accNo: Int, accBal: Double, accName: String) : this(accNo, accBal) {
        lastName = accName
    }

    //custom accessor
    var balanceLessFees: Double
        get() {
            return accountBalance - fees
        }
        set(value) {
            accountBalance = value - fees
        }

    fun displayBalance() {
        println("Number: $accountNumber")
        println("Balance: $accountBalance")
        if(lastName.isNotEmpty()){
            println("Owner: $lastName")
        }
        else{
            println("John Doe Account.")
        }
    }
}

class SavingsAccount(val accNumber: Int, var accBalance: Double) :
    BankAccount(accNumber, accBalance) {
    var interestRate:Double = 0.0

    constructor(number: Int, balance: Double, name: String) : this(number, balance) {
        lastName = name
    }

    constructor(number: Int, balance: Double, name: String,rate:Double) : this(number, balance) {
        lastName = name
        interestRate = rate
    }

    fun calculateInterest():Double{
        if(interestRate > 0)
        return accBalance * interestRate

        return accBalance
    }

}