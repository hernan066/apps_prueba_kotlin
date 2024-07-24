package com.example.primeraapp.sintaxis

fun main() {
    // funciones

    variables()

    val result = add(10, 5)
    println(result)

}

fun variables() {
    //Variables Numericas

    //Int -2,147,483,647 a 2,147,483,647
    val age: Int = 30

    //Long -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807
    val example: Long = 30

    //Float
    val floatExample: Float = 30.5f

    //Double
    val doubleExample: Double = 3241.3123123

    //Variables AlfaNumericas

    //Char
    val charExample1: Char = 'e'
    val charExample2: Char = '2'
    val charExample3: Char = '@'

    //String
    val stringExample: String = "AristiDevs suscribete"

    //Variables Boleanas

    // Boolean
    val booleanExample: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3: Boolean = false

    var name = ""
    var edad = 0

    name = "Hernan"
    edad = 42

    //println("Hola me llamo $name y tengo $edad años")
}

fun add(num1: Int, num2: Int): Int {
    return num1 + num2
}

fun add2(num1: Int, num2: Int): Int = num1 + num2

