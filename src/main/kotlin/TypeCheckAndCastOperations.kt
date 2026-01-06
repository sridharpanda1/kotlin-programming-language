package org.example

fun typeCheckAndCastOperations() {
    functionFileName("Type Checking and Cast Operation Program")

    val data: Any = "Kotlin"

    println("Type Checking and Cast Operations")
    dottedSeparator()

    println("data is String : ${data is String}")
    println("data is Int    : ${data is Int}")

    if (data is String) {
        println("String length : ${data.length}")
    }

    if (data !is String) {
        println("Data is NOT a String")
    }

    val number: Any = 25
    /*
    * Returns the value if cast is possible
      Returns null if cast fails
      No crash
    * */
    val castedNumber = number as? String
    println("Casted number : $castedNumber")

    dottedSeparator()
}
