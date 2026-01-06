package org.example

import org.example.operations.arithmeticOperations
import org.example.operations.assignmentOperations
import org.example.operations.bitwiseOperations
import org.example.operations.comparisonOperations
import org.example.operations.inOperatorOperations
import org.example.operations.indexOperations
import org.example.operations.logicalOperations
import org.example.operations.nullSafetyOperations
import org.example.operations.rangeOperations
import org.example.operations.stringConcatenationOperation
import org.example.operations.stringRepetitionOperation
import org.example.operations.typeCheckAndCastOperations
import org.example.operations.unaryOperations

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    helloWorld("Sridhar Panda")
    employeeDetails("Sridhar", "Panda", 25, 80000.0)
    arithmeticOperations()
    unaryOperations()
    comparisonOperations()
    logicalOperations()
    assignmentOperations()
    typeCheckAndCastOperations()
    nullSafetyOperations()
    rangeOperations()
    indexOperations()
    inOperatorOperations()
    bitwiseOperations()
    stringConcatenationOperation()
    stringRepetitionOperation()


}