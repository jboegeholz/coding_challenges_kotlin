/*
    Coding Challenge #3
    Write a script which converts system input from lower case to uppercase and prints it
 */

fun main(args: Array<String>) {
    print("Enter text: ")

    val stringInput = readLine()!!
    println("You entered: ${stringInput.uppercase()}")
}