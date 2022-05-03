/*
    Coding Challenge #9
    Have the function first_reverse(input) take the input parameter being passed and return the string in reversed order.
    For example:
        if the input string is
        “Hello World and Coders” then your program should return the string
        “sredoC dna dlroW olleH”.

 */

fun firstReverse(s: String): String {
    var retStr = ""
    for (i in s.length-1 downTo 0){
        retStr += s[i]
    }
    return retStr
}