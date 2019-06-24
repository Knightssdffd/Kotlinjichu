package jingqu.com.kotlinjichu.jichu25_kotlin异常处理

/**
 *  Created by  幻忧 on  2019/6/24 23:29
 */

fun main() {
    while (true) {
        val a = readLine()
        val b = readLine()
        try {
            val x = a!!.toInt()
            val y = b!!.toInt()
            println("$x + $y = ${x + y}")
        } catch (e: NumberFormatException) {
            println(e.message)
        } finally {

        }
    }


}