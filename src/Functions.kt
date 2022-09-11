/*
Functions and its different flavours
Single Line Function
Default Arguments
Unit Function
 */

//Function - It is a block of code to perform certain functionality
// and Helps to reuse code
/*
fun functionNAme(param1, param2):ReturnType{
block of code
return result
}
 */

fun main() {
    val result = add(4, 5)
    println("......to print something........")
    println("Sum of 4 and 5 is $result")
    println("......to print even Or odd........")
    println(evenOrOdd(6))
    println("......to print multiply using inline function ........")
    println(multiply(4, 5))
    println("......to print according to count value........")
    printMsg(3)
    println("......eg of default argument........")
    printWithDefaultArgument()

}

fun add(num1: Int, num2: Int): Int {
    val sum = num1 + num2
    return sum
}

fun evenOrOdd(num: Int): String {
    return if (num % 2 == 0) {
        "$num is Even"
    } else {
        "$num is Even"
    }
}

//inline function
fun multiply(num1: Int, num2: Int): Int = num1 * num2
// you can write above fun as below
//fun multiply(num1: Int, num2: Int) = num1 * num2

fun printMsg(count: Int) {
    for (i in 1..count) {
        println("Hello $i")
    }
}

//default argument
fun printWithDefaultArgument(count: Int = 2) {
    for (i in 1..count) {
        println("Hello $i")
    }
}