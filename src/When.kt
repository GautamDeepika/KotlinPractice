fun main() {
    val animal = "Dog"
    when (animal) {
        "horse" -> {
            println("Animal is Horse")
        }
        "Cat" -> {
            println("Animal is Cat")
        }
        "Dog" -> {
            println("Animal is Dog")
        }
        else -> {
            println("Animal not found")
        }
    }

    // when as an expression
    val  num = 12
    val result = when (num) {
        11 -> "Animal is Horse"
        in 12..14 -> "Animal is Cat"
        15 -> "Animal is Dog"
        else -> "Animal not found"
    }
    println(result)

}