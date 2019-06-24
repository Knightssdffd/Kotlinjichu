package jingqu.com.kotlinjichu.jichu15_kotlin条件控制if和else

/**
 *  Created by  幻忧 on  2019/6/24 22:07
 */

fun main() {
    println("较大值 ${zhidazhi(20, 84)}")
}

fun zhidazhi(ars1: Int, ars2: Int): Int {
    if (ars1 > ars2) return ars1 else return ars2
}