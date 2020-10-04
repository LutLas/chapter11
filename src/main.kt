fun main() {
    val addInts = { x: Int, y: Int -> x + y }
    val addFive:(Int)->Int = {it+5}
    val result = addInts.invoke(6, -7)
    val answer = addInts(5,0)
    val greeting = {"Hello World"}
    val other = {z:Int->"The value is $z"}
    val calculation= {x:Int, y:Int, z:Int->z*x/y}
    val myLambda={ println("Bye!")}
    println(result)
    println(answer)
    println(greeting())
    println(other(20))
    println(
            addFive(
                    addInts(6,result)-calculation(2,4,8)
            )
    )
    myLambda()
    convert(20.0) { it * 1.8 + 32 }
    convertFive { it *1.8+32 }

    val options = arrayOf("Red","Amber","Green")
    val crossWalk = options[
            (Math.random() * options.size).toInt()
    ]
    if(crossWalk == "Green"){
        println("Walk!")
    }
    unless(crossWalk == "Green"){
        println("Stop!")
    }

   val celsius = getConversionLambda("CentigradeToFahrenheit")(2.5)
    println(celsius)
}

fun convert(
      x: Double,
      converter: (Double)->Double
):Double{
    val result = converter(x)
    println("$x is converted to $result")
    return result
}

fun convertFive(converter: (Int) -> Double) : Double {

    val result = converter(5)

    println("5 is converted to $result")

    return result

}

fun unless(
        condition:Boolean,
        code:()->Unit
){
    if (!condition){
        code()
    }
}

fun getConversionLambda(str: String):(Double)->Double{
    when (str) {
        "CentigradeToFahrenheit" -> {
            return{ it * 1.8 + 32 }
        }
        "KgsToPounds" -> {
            return{ it * 2.204623 }
        }
        "PoundsToUSTons" -> {
            return{ it/2000.0 }
        }
        else -> {
            return{ it }
        }
    }
}