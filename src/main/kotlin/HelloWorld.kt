package org.example

import org.example.helper.dottedSeparator
import org.example.helper.functionFileName

fun helloWorld(name : String) {
    functionFileName("Hello World Program")
    println("Hello $name, Welcome to Kotlin World")

    dottedSeparator()
}