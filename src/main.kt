fun main() {
    val addInts = { x: Int, y: Int -> x + y }
    val addFive:(Int)->Int = {it+5}
    val result = addInts.invoke(6, -7)
    val answer = addInts(5,0)
    val greeting = {"Hello World"}
    val other = {z:Int->"The value is $z"}
    println(result)
    println(answer)
    println(greeting())
    println(other(20))
    println(
            addFive(
                    addInts(6,result)
            )
    )
}