fun main() {
    //Loops
    /*
     *Execute set of statements multiple times
     * eg. Print Hello 5 times
     */

    var count = 5
    while (count > 0) {
        println("Hello")
        count--
    }


    // to print multiple of 2
    var num = 2
    var index = 1
    while (index <= 10) {
        println(num * index)
        index++
    }

    //do-while
    var j = 5
    do {
        println("Hello World!")  //  loop executes at least once whether condition is false or not
        j--
    } while (j > 0)

}