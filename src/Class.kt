fun main() {
    var mustang = Car("mustang", "petrol", 100)
    var beetle = Car("beetle", "diesel", 200)
    println(mustang.kmRun)
    println(beetle.type)
}

class Car(val name: String, val type: String, var kmRun: Int) {
    fun driveCar() {
        println("car is driving")
    }

    fun applyBreaks() {
        println("Applied brakes")
    }
}