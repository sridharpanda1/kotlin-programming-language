package org.example

fun unaryOperations() {
    functionFileName("Unary Operation Program")

    var x = 20

    println("Unary operation +x:  ${+x}")
    dottedSeparator()

    println("Unary operation -x:  ${-x}")
    dottedSeparator()

    println("Unary operation ++x:  ${++x}") // pre-increment
    dottedSeparator()

    println("Unary operation x++:  ${x++}") // post-increment
    dottedSeparator()

    println("Value of x after x++:  $x")
    dottedSeparator()

    println("Unary operation --x:  ${--x}") // pre-decrement
    dottedSeparator()

    println("Unary operation x--:  ${x--}") // post-decrement
    dottedSeparator()

    println("Value of x after x--:  $x")
    dottedSeparator()

    val flag = true
    println("Unary operation !flag: ${!flag}")
}