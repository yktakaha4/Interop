@file:JvmName("Hero")

fun main(args: Array<String>) {
    val adversary = Jhava()
    println(adversary.utterGreeting())

    val friendshipLevel = adversary.determineFriendshipLevel()
    println(friendshipLevel?.toLowerCase() ?: "It's complicated.")
    println(adversary.hitPoints.dec())

    adversary.greeting = "Hello, Hero."
    println(adversary.utterGreeting())
}

fun makeProclamation() = "Greetings, beast!"

fun handOverFood(leftHand: String = "berries", rightHand: String = "beef") {
    println("Mmmm... you hand over some delicious $leftHand and $rightHand.")
}