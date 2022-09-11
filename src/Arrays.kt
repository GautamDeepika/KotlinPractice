//Arrays and use of Arrays
/*
 * If I want to store 50 favorite songs of a user
 * Defining 50 variables will be a mess
 * To solve these kinds of problems we have Arrays
 * Arrays is object that stores multiple values of same type
 * It is of fixed size
 * Syntax - var arr = arrayOf("1","2","3")
 */
fun main() {
    var arr = arrayOf("One", "Two", "Three")
    var arr1 = arrayOf(1, 2, 3)
    var arr2 = arrayOf<Int>(3, 4, 5)

    for (i in arr) {
        println(i)
    }
    println("to print index value")
    for ((i, e) in arr.withIndex()) {
        println("$i - $e")
    }

    println("Tp print particular index value")
    println("array value ${arr[0]} is at 0 index")
    println(arr.get(1))
    arr[0] = "Four"
    for (i in arr) {
        println(i)
    }
    println(arr.size)
}



