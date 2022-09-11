/*  Override
*   calling parameterized constructors
*   Getter/Setter Override
*   Any Type
 */

fun main() {
    val onePlus = OnePlus("SmartPhone")
    onePlus.display()
    val generalMobile = MobilePh("General")
    generalMobile.display()
    println(onePlus.name)
    println(onePlus.size)
    println(onePlus.toString())
}

open class MobilePh(val type: String) {
    open val name: String = "MobilePhone"
    open val size: Int = 5
    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

class OnePlus(typeParam: String) : MobilePh(typeParam) {
    override val name: String
        get() = "OnePlus"
    override val size: Int
        get() = 6

    override fun display() {
        super.display()
        println("Child Mobile Display")
    }

    override fun toString(): String {
        return "Name - $name - Size - $size"
    }
}


//  Any < Mobile < OnePlus

//Like Object is parent class in java
//Any class is super class for every class
