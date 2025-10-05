package syntacticSugar

fun main(args: Array<String>) {
    var score: Int = 3
    var isLess = true

    if(score < 4) {
        println("Value less than 4")
    } else {
        println("More than 4")
        isLess = false
    }
    println(isLess)



    // We can store the whole conditions in a variable, it can also work with WHEN Conditional as well
    var isLessThanFour = if(score < 4) {
        "-- Value less than 4 --"
    } else {
        "-- More than 4 --"
    }
    println(isLessThanFour)

}