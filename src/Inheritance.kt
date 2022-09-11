//Literal meaning - derive(a quality, characteristics,
//or predisposition) genetically from one's parents and ancestors

// Is-A relationship
fun main() {
val objChild = Child()
    objChild.myMethod()
    objChild.myMethod2()
}

open class Parent {
    val name: String = ""
init {
    println("parent constructor is called")
}
    fun myMethod() {
        println("I am a parent")
    }
}

//you can inherit from on class only
class Child : Parent() {
    val name2: String = ""
    init {
        println("child constructor is called")
    }
    fun myMethod2() {
        println("I am a child")
    }
}
//code re usability
//open keyword (  class A: B()  )
//can't inherit from multiple classes
//Parent class constructor is called before child class constructor
