fun main() {
    var i: Int = 20
    println(i.plus(30))
    println(i.toFloat())

    val p1 = PersonType("A", 21)
    val p2 = PersonType("B", 16)
    println(p1.canVote())
    println(p2.canVote())
}

class PersonType(val name: String, var age: Int) { //properties
    //methods
    fun canVote(): Boolean {
        return age > 18
    }
}