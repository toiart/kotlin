package org.example

fun main() {
    list()
    maps()
}

private fun list() {
    // creation
    val numArray = arrayOf(1, 2, 3)
    val numList = listOf(1, 2, 3)

    // access
    val firstItem = numList[0]
    val firstItemAgain = numList.first()
    val firstItemAgainAgain = numList.firstOrNull()

    println(firstItem)
    println(firstItemAgain)
    println(firstItemAgainAgain)

    // iterate
    for (item in numArray) {
        println(item)
    }

    numArray.forEach {
        println(it)
    }

    numArray.forEachIndexed { index, item ->
        println("Item at $index is: $item")
    }

    // filter and search
    val evenNumbers = numList.filter { it % 2 == 0 }
    val containsEven = numList.any { it % 2 == 0 }
    val containsNoEvens = numList.none { it % 2 == 0 }
    val firstEvenNumber: Int = numList.first { it % 2 == 0 }
    println(evenNumbers)
    println(containsEven)
    println(containsNoEvens)
    println(firstEvenNumber)
}

fun maps() {
    val faceCards = mapOf("Jack" to 11, "Queen" to 12, "King" to 13)
    val jackValue = faceCards["Jack"]
    println(jackValue)
//    faceCards["Ace"] = 1
    println(faceCards)
}
