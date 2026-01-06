package org.example.operations

import org.example.helper.dottedSeparator
import org.example.helper.functionFileName

fun stringRepetitionOperation() {
    functionFileName("String Repetition Operation Program")

    val text = "Hi "

    println("String Repetition Operation")
    dottedSeparator()

    println("text.repeat(3) : ${text.repeat(3)}")

    dottedSeparator()
}
