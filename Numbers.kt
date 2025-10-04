fun main() {
    var a = 10
    println(a)

    var b = 20000.19
    println(b)

    // For large numbers, to distinguish between digits we can use underscore(_) upon printing it will neglect it.
    // Only works with Numbers
    var c = 10_000_00
    println(c)

    var d = 88_888_88L
    println(d)

    // explicitly telling the data-type
    var e : Int? = 1
    println(e)
}
