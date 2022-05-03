/*
    Coding Challenge #9
    Have the function first_reverse(input) take the input parameter being passed and return the string in reversed order.
    For example:
        if the input string is
        “Hello World and Coders” then your program should return the string
        “sredoC dna dlroW olleH”.

 */

fun firstReverse(s: String): String {
    return if (s.length == 1) {
        s
    } else if (s.length == 2) {
        "" + s[1] + s[0]
    } else if (s.length == 3) {
        "" + s[2] + s[1] + s[0]
    } else if (s.length == 4) {
        var retStr = ""
        for (i in s.length-1 downTo 0){
            retStr += s[i]
        }
        retStr
    } else {
        ""
    }
}