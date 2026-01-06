package org.example.operations

import org.example.helper.dottedSeparator
import org.example.helper.functionFileName

fun inOperatorOperations() {
    functionFileName("In Operator Program")

    val numbers = listOf(1, 2, 3, 4, 5)

    println("In Operator Operations")
    dottedSeparator()

    println("3 in numbers  : ${3 in numbers}")
    println("10 !in numbers : ${10 !in numbers}")
    println("5 in 1..10   : ${5 in 1..10}")

    dottedSeparator()
}
