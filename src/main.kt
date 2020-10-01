fun main() {
    val addInts = { x: Int, y: Int -> x + y }
    val result = addInts.invoke(6, 7)
    val answer = addInts(5,0)
    println(result)
    println(answer)
}