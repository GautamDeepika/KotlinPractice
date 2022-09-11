/*Function overloading
 *Named Argument
 *Function Type
*/

fun main() {
    println("sum of integers")
    println(addition(4, 5))
    println(addition(1.0, 2.0))
    println("........named arguments......")
    println(addition(b = 2, a = 3))
}

/*Function overloading - Same name with different parameters
 * Either number of parameters is different
  *Or Type is different
 */
private fun addition(a: Int, b: Int): Int {
    return a + b
}

private fun addition(a: Double, b: Double): Double {
    return a + b
}



