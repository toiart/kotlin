package org.example

fun main() {
    // if
    calculateScore(75)
    calculateScore(85)

    // when
    println(checkDayType("Monday"))
    println(checkDayType("Saturday"))
}

private fun calculateScore(score: Int) {
    val grade = if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else {
        "F"
    }
    println(grade)
}

fun checkDayType(day: String): String {
    return when (day.lowercase()) {
        "saturday", "sunday" -> "Weekend"
        "monday", "tuesday", "wednesday", "thursday", "friday" -> "Weekday"
        else -> "Invalid day"
    }
}
