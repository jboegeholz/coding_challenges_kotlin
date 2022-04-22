/*
    Coding Challenge #7
    Write a function is_even(num) which returns true if value is even
 */

fun main(args: Array<String>) {
    for (i in 1..10) {
        println("Is $i even: ${isEven(i)}")
    }
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}