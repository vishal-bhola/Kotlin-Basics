fun main() {

    var highScore: Int = 200

    var currentScore: Int = 200

    if (currentScore < highScore) {
        println("You have missed the high score")
    } else if(currentScore == highScore) {
        println("You are exactly on high score!!")
    } else {
        println("congrats on high score!")
    }


}