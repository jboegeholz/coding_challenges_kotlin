import kotlin.random.Random

/*
    Coding Challenge #6
    Write your first unit test for the generate password function
 */
fun generatePassword(): String {
    val lowerAlphabet = ('a'..'z').toList()
    val upperAlphabet = ('A'..'Z').toList()
    val digits = ('0'..'9').toList()
    val specialChar = listOf('!', '”', '§', '$', '%', '&', '/', '?')

    val passwordHalfOne = listOf<Char>(lowerAlphabet.random(), upperAlphabet.random(), digits.random(), specialChar.random())
    val passwordHalfTwo = listOf<Char>(lowerAlphabet.random(), upperAlphabet.random(), digits.random(), specialChar.random())

    val password = passwordHalfOne + passwordHalfTwo
    return password.shuffled().joinToString("")
}