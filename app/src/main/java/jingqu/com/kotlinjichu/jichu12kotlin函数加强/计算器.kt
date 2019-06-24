package jingqu.com.kotlinjichu.jichu12kotlin函数加强

/**
 *  Created by  幻忧 on  2019/6/24 21:43
 */

fun main(args: Array<String>) {
 val arg1=8
 val arg2=2
    println(jia(arg1,arg2))
    println(jian(arg1,arg2))
    println(chen(arg1,arg2))
    println(chu(arg1,arg2))
}


fun jia(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

fun jian(arg1: Int, arg2: Int): Int {
    return arg1 - arg2
}

fun chen(arg1: Int, arg2: Int): Int {
    return arg1 * arg2
}

fun chu(arg1: Int, arg2: Int): Int {
    return arg1 / arg2
}