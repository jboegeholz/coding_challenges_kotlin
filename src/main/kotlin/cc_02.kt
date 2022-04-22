import kotlin.random.Random

/*
    Coding Challenge #2
    Write a program that prints 10 random numbers between 1 and 10
 */

fun main(args: Array<String>) {
    for(x in 1..10){
        val myRand = Random.nextInt(0, 10)
        println("$myRand")
    }
}