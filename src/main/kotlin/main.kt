
fun main(){
    println("Укажите сколько лайков?")
    val likes = readLine()!!.toInt()
    if (likes % 2 == 0) {
        println("Людям")
    } else println("Человеку")

}