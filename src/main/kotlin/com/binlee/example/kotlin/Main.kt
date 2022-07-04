package com.binlee.example.kotlin

import com.binlee.example.kotlin.bean.User

fun main(args: Array<String>) {
    println("Hello Kotlin World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    println(User("Ben", 28))

    println("What's you name?")
    val name = readlnOrNull()
    println("Hello $name, welcome to kotlin world, there'll be much fun!")

    log("simple log without prefix")
    log("log with prefix", "tag")
}

// 函数默认参数

fun log(msg: String?, prefix: String = "") = if (prefix == "") {
    println(msg)
} else {
    println("$prefix: $msg")
}