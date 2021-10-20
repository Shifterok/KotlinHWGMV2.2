fun main() {
    println("Укажите сколько лайков?")
    val likes = readLine()!!.toInt()
    val firstNumber = likes - 1
    val secondNumber = likes - 11

    fun checkOut() {
        if (firstNumber % 10 == 0 || secondNumber % 10 == 0) println("Понравилось $likes человеку")
        else println("Понравилось $likes люядм")
    }
    checkOut()

    println("Как то так =) ")
}