/*
    Coding Challenge #4
    Write a program that prints all letters from the alphabet (upper case) with their respective position in the alphabet e.g. 1: a, 2: b
 */

fun main(args: Array<String>) {
    for(i in 1..26){
        val ic = i + 64
        println("$i: ${ic.toChar()}")
    }
}