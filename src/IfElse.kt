fun main() {
    val isHoliday = true

    if (isHoliday == true) {
        println("Today is Holiday")
    } else {
        println("Today is not Holiday")
    }

    //if - else as an expression
    val x = 10
    val y = 10
    val result = if (x < y) {
        println("y is greater")
    } else if (x > y) {
        println("x is greater")
    } else {
        println("x is equal to y")
    }

}