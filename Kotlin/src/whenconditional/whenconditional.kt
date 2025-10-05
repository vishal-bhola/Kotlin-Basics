package whenconditional

fun main() {
    var score: Int = 20

    when (score) {
        1 -> println("Score is 1")
        2 -> println("Score is 2")
        
        // To check multiple condition at same time. It's like OR condition, either this or that.
        3, 4 -> println("Your score is 3 or may be 4")
        
        5 -> {
            println("You got high score")
            println("Your score is 5")
        }

        // To check if a number is in range or not. Instead doing 6,7,8,9,10 we can use IN operator. The Range is INCLUSIVE
        in 6..10 -> {
            println("Its in range of 6 to 10")
        }

        // Similarly we can use !in to check not in range
        !in 11..15 -> {
            println("Not in range")
        }

    }
}