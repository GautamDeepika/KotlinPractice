fun main() {
    //acc to polymorphism parent can hold ref. to his child
    //Parent can call methods of child classes(which are common)
    val circle: Shape = Circle(4.0)
    val square: Shape = Square(4.0)
    println(circle.area())
    println(square.area())

    val shapes = arrayOf(Circle(4.0), Triangle(3.0, 4.0), Square(4.0))
    calculateAreas(shapes)
}

open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle(private val base: Double, private val height: Double) : Shape() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}

fun calculateAreas(shapes: Array<Shape>) {
    for (shape in shapes) {
        println(shape.area())
    }
}

//Helps to write Maintainable & Extensible code
//Helps in interacting with objects via common interface