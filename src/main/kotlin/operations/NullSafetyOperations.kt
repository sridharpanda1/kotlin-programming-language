package org.example.operations

import org.example.helper.dottedSeparator
import org.example.helper.functionFileName

fun nullSafetyOperations() {
    functionFileName("Null Safety Operation Program")

    var name: String? = "Kotlin"

    println("Null Safety Operations")
    dottedSeparator()

    println("name?.length              : ${name?.length}")
    println("Elvis operator length     : ${name?.length ?: 0}")
    println("Not-null assertion (!!)   : ${name!!.length}")

    // Safe-call chain example
    val result = name?.uppercase()?.length
    println("Safe-call chain (?.)      : $result")

    dottedSeparator()
}
