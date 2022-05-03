/*
    Coding Challenge #10
    Have the function compare(num1, num2) take both parameters being passed and
    return –1 if num1 is less than num2,
    otherwise return 1.
    If the parameter values are equal to each other then return 0.

 */

fun compare(num1: Int, num2: Int): Int {
    return if (num1 > num2) {
        1
    } else if (num1 == num2) {
        0
    } else {
        -1
    }
}