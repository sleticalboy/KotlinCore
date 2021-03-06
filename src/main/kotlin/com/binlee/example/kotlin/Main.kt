package com.binlee.example.kotlin

import com.binlee.example.kotlin.bean.User

fun main(args: Array<String>) {
    println("Hello Kotlin World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    println(User("Ben", 28))
    println(User("Ben"))

    println("What's you name?")
    val name = readlnOrNull()
    println("Hello $name, welcome to kotlin world, there'll be much fun!")

    log("simple log without prefix")
    log("log with prefix", "tag")


    // 植入函数
    infix fun Int.times(s: String) = s.repeat(this)
    log(2 times "infix function -")


    // 操作符函数
    operator fun String.get(range: IntRange) = substring(range)
    log("Hello Kotlin"[3..8])
}

// 可变参数：在运行时就是 Array<*>
fun addAll(list: MutableList<String>, vararg args: String) {
    for (arg in args) list.add(arg)
    list.addAll(args)
    // 可变参数展开：另一个函数的入参也是可变参数，* 可以让另一个函数知道，传递的是可变参数
    addAllInternal(list, *args)
}

private fun addAllInternal(list: MutableList<String>, vararg args: String) {
    list.addAll(args)
}


// 函数默认参数

fun log(msg: String?, prefix: String = "") = if (prefix == "") {
    println(msg)
} else {
    println("$prefix: $msg")
}