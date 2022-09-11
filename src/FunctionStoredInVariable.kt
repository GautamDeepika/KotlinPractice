import kotlin.math.pow

fun main() {
    println("........store function in variable......")
    var fn: (a: Double, b: Double) -> Double = ::addition
    println(fn(1.0, 2.0))

    fn = ::power
    println(fn(2.0, 3.0))
}

private fun addition(a: Double, b: Double): Double {
    return a + b
}

private fun power(a:Double, b:Double): Double{
    return a.pow(b)
}