package jingqu.com.kotlinjichu.jichu17_kotlin空值处理

/**
 *  Created by  幻忧 on  2019/6/24 22:22
 */

fun main() {
    heat("ssssssss")
//   加？可以为空
    heat(null)
}

fun heat(arg: String?) {
    println(arg)
}