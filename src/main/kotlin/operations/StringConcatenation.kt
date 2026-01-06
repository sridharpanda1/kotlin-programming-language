package org.example.operations

import org.example.helper.dottedSeparator
import org.example.helper.functionFileName

fun stringConcatenationOperation() {
    functionFileName("String Concatenation Operation Program")

    val first = "Hello"
    val second = "Kotlin"

    println("String Concatenation Operation")
    dottedSeparator()

    println("first + second : ${first + " " + second}")

    dottedSeparator()
}
