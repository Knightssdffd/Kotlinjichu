package jingqu.com.kotlinjichu.jichu26_kotlin递归

/**
 *  Created by  幻忧 on  2019/6/24 23:34
 */

fun main() {
    val fact = fact(10)
    println(fact)
}

fun fact(num: Int): Int {
    if (num == 1) {
        return 1
    } else {
        return num * fact(num - 1)
    }
}