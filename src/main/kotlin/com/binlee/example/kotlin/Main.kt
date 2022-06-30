
package com.binlee.example.kotlin

fun main(args: Array<String>) {
    println("Hello Kotlin World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    println(Model("Ben", 28))
}

data class Model(
    val name: String,
    val age: Int
)