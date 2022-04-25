import kotlin.random.Random
/*
    Coding Challenge #5
    Write a function which generates random passwords

    8 characters in length
    Must contain at least one alphabet lower case
    Must contain at least one alphabet upper case
    Must contain at least one digit
    Must contain at least one special character from !”§$%&/?

 */

fun main(args: Array<String>) {
    val lowerAlphabet = ('a'..'z').toList()
    val upperAlphabet = ('A'..'Z').toList()
    val digits = (0..9).toList()
    val specialChar = listOf('!', '”', '§', '$', '%', '&', '/', '?')
    val allowedChars = lowerAlphabet + upperAlphabet + digits + specialChar

    var password = ""
    for(i in 0..8){
        val myRand = Random.nextInt(0, allowedChars.size)
        password += allowedChars[myRand]
    }
    println("The password is: $password")

}