fun main() {
    var myString = "Peter"
    println(myString)

    var score = 100
    println("Hi Peter, your score is $score")

    // Using triple quotes to print the string in exact the same manner
    var rawString = """
    this is my
    raw String
    It will print exatly,   it's Printed
       in this way
       """
    println(rawString)


    var nameLength = "Hi Peter, length in your name is ${myString.length}"
    println(nameLength)


    // Iterate over name and print
    for (s in myString) {
        print(s)
    }
}