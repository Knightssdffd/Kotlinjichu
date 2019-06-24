package jingqu.com.kotlinjichu.jichu26_kotlin递归

/**
 *  Created by  幻忧 on  2019/6/24 23:45
 */
fun main() {
    jia(100000,0)
}

tailrec fun jia(num: Int, result: Int): Int {
    println("$num")
    if (num == 1) {
        return 1
    } else {
        return jia(num - 1, result + num)
    }
}