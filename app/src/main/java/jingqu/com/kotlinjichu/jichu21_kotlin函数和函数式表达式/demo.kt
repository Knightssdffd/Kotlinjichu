package jingqu.com.kotlinjichu.jichu21_kotlin函数和函数式表达式

/**
 *  Created by  幻忧 on  2019/6/24 23:09
 */

fun main() {
    println(add(5, 8))
    val i = { x: Int, y: Int -> x + y }
    println(i(5, 6))

//    var j: (Int, Int) -> Int = { a, b, -> a + b }

}


//fun add(arg: Int, arg2: Int): Int {
//    return arg + arg2
//}

fun add(arg: Int, arg2: Int) = arg + arg2
