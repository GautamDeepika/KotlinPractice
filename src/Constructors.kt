//class has 2 things
//Constructors :- initialize object and provides default values to properties
fun main() {
    var mobile = Mobile("Samsung", "Android", 101)
    var mobile2 = Mobile("IPhone", "Apple")
    println(mobile.brand)
    println(mobile.modelNumber)
    println(mobile2.brand)
    println(mobile2.modelNumber)
    var person1 = Person()
    println(person1.age)
    println(person1.name)
    var person2 = Person()
    println(person2.age)
    println(person2.name)
}

class Mobile(val brand: String, val type: String, val modelNumber: Long) {
    init {
        println("$brand is awesome")
    }

    init {
        println("2nd block")
    }

    init {
        println("3rd block")
    }

    constructor(brandName: String, typeParams: String):
            this(brandName, typeParams, 105)

    fun playGames() {}
    fun switchOff() {}

}

class Empty {}

public class Person() {
    val name: String = ""
    val age: Int = 0
}