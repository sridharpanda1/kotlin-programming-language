package org.example

fun rangeOperations() {
    functionFileName("Range Operation Program")

    println("Range Operations")
    dottedSeparator()

    print("1..5        : ")
    for (i in 1..5) print("$i ")
    println()

    print("1 until 5  : ")
    for (i in 1 until 5) print("$i ")
    println()

    print("5 downTo 1 : ")
    for (i in 5 downTo 1) print("$i ")
    println()

    print("1..10 step 2 : ")
    for (i in 1..10 step 2) print("$i ")
    println()

    dottedSeparator()
}
