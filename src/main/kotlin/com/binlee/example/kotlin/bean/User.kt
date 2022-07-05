package com.binlee.example.kotlin.bean

data class User constructor(
    val name: String,
    val age: Int
) {
    init {
        println("Init block： $name")
    }

    constructor(name: String) : this(name, -1) {
        // 次构造器，代码晚于 init {} 执行
        println("secondary constructor: $name")
    }
}