package org.example.operations

import org.example.helper.dottedSeparator
import org.example.helper.functionFileName

fun logicalOperations() {
    functionFileName("Logical Operation Program")

    val a = true
    val b = false

    println("Logical Operations")
    dottedSeparator()

    println("a && b : ${a && b}")
    println("a || b : ${a || b}")
    println("!a     : ${!a}")

    dottedSeparator()
}
