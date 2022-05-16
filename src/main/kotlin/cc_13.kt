/*
    Coding Challenge #13
    Have the function time_convert(minutes) take the minutes parameter being passed
    and return the number of hours and minutes the parameter converts to
    (ie. if minutes= 63 then the output should be 1:03).
    Separate the number of hours and minutes with a colon.
 */

fun convertTime(timeInMinutes: Int): String {
    val hours = timeInMinutes / 60
    val minutes = timeInMinutes % 60
    return "${hours.toString()}:${minutes.toString().padStart(2, '0')}"
}