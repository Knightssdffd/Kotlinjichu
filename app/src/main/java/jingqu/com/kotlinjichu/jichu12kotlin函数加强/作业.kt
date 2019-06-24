package jingqu.com.kotlinjichu.jichu12kotlin函数加强

/**
 *  Created by  幻忧 on  2019/6/24 21:48
 */

fun main() {
    println(sayHello("aaaaaa"))
    println(checkAge(19))
    saveLog(54)
}


fun sayHello(name: String): String {
    return "$name hello world"
}

fun checkAge(arg: Int): Boolean {
    return arg > 18
}

fun saveLog(logLevel: Int) {
    println(logLevel)
}
