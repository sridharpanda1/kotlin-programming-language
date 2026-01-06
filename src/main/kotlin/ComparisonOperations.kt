package org.example

fun comparisonOperations() {
    functionFileName("Comparison Operation Program")

    var x = 20
    var y = 10
    var z = 20

    // 1. Structural Equality
    println("Structural Comparison operations")
    dottedSeparator()

    println("x == y : ${x == y}")   // false
    println("x == z : ${x == z}")   // true
    println("x != y : ${x != y}")   // true
    println("x != z : ${x != z}")   // false
    println("x === y : ${x != y}")   // true
    println("y === z : ${y != z}")   // true
    println("x === z : ${x != z}")   // false


    dottedSeparator()

    // 2. Relational Operators
    println("Relational Comparison operations")
    dottedSeparator()

    println("x > y  : ${x > y}")    // true
    println("x < y  : ${x < y}")    // false
    println("x >= z : ${x >= z}")   // true
    println("y <= x : ${y <= x}")   // true

    dottedSeparator()
}
