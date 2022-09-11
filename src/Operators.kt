/*
Arithmetic Operators
Relational Operators
Increment and Decrement Operator
 */

fun main() {

    var i = 12
    var j = 5

    //Arithmetic Operators
    println(i + j) //17
    println(i - j)  //7
    println(i * j)   //60
    println(i / j)  //2
    //modulus operator -- remainder value
    //eg. - 13 % 2 = 1
    println(i % j)  //2

    /*
    Relational Operators
    Greater than ( > )
    Less than ( < )
    Greater than Equal To ( >= )
    Less than Equal To ( <= )
    Equals( == ) - Double equal vs single equal
    Not Equal ( != )
     */

    println(i > j) // true
    println(i < j)  //false
    println(i >= j)  //true
    println(i <= j)  //false
    println(i == j)  //false
    println(i != j)  //true

    /* Pre/Post Increment
        i++
        ++i
        i--
        --i  */

    i++
    println(i)
    i--
    println(i)
    ++j
    println(j)
    --j
    println(j)
    println(i++ + ++i)
    println(j-- - --j)


    //Logical operators - &&, ||, !
    

}