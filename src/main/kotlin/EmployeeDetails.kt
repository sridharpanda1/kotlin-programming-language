package org.example

import org.example.helper.dottedSeparator
import org.example.helper.functionFileName

fun employeeDetails(firstName: String = "DefaultName", lastName: String = "DefaultSurname", age: Int = 25, salary: Double = 70000.0) {
    functionFileName("Val and Var Program")

    println("Employee details")
    dottedSeparator()
    var employeeName : String = "$firstName $lastName"
    var employeeAge : Int = age
    var employeeSalary : Double = salary

    val employeeAddress: String = "Bangalore, KA, IN"

//    'val' cannot be reassigned. It will rise an error.
//    employeeAddress = "Berhampur, OD, IN"

    println("Employee Name: $employeeName")
    println("Employee Age: $employeeAge")
    println("Employee Salary: $employeeSalary")
    println("Employee Address: $employeeAddress")

    dottedSeparator()
}