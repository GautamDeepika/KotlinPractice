//For loop
//Range (.., until, downTo, Step)
fun main() {
    println("................in................")

    for (i in 1..5) {
        println(i)
    }
    println("................step 2................")

    for (i in 1..5 step 2) { // step 2 -> counter increased by 2
        println(i)
    }
    println("................until................")
    for (i in 1 until 5) { // excludes the outer bound i.e  5
        println(i)
    }
    println("................for negative loops................")
    println("................downTo................")
    for (i in 10 downTo 1) {
        println(i)
    }
    println("................downTo  with step ................")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
    println("table of 2")
    var num = 2
    for (i in 1..10) {
//        println(i * num)
        //2 * 1 = 2
        println("$num x $i = ${num * i}") //string templating
    }

}