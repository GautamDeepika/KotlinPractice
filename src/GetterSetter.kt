//Default Constructor
//Getter Setter
//LateInit
fun main() {
    val ob = Calculator()
    println(ob.add(2, 3))
    var p1 = PersonInfo("abcd", 21)
    println(p1.age)
    p1.age = 23
    p1.age = -12
    println(p1.name)
    println(p1.age)
}

class Calculator {

    lateinit var message: String
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}

class PersonInfo(nameParam: String, ageParam: Int) {
    var name: String = nameParam
    get() {
        println("name getter is called")
        return field.toUpperCase()
    }
    var age: Int = ageParam
        set(value) {
            if (value > 0) {
                field = value
            }else{
                println("Age can't be negative")
            }
            println("age setter is called")
        }

}