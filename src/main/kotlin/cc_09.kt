/*
    Coding Challenge #9
    Have the function first_reverse(input) take the input parameter being passed and return the string in reversed order.
    For example:
        if the input string is
        “Hello World and Coders” then your program should return the string
        “sredoC dna dlroW olleH”.

 */

fun firstReverse(s: String): String {
    if (s.length == 1) {
        return s
    } else if (s.length == 2) {
        return "" + s[1] + s[0]
    } else {
        return ""
    }
}