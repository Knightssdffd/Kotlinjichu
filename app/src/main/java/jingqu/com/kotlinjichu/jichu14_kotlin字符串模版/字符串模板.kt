package jingqu.com.kotlinjichu.jichu14_kotlin字符串模版

/**
 *  Created by  幻忧 on  2019/6/24 21:59
 */


fun main() {
    println(diaryGenerater("你好世界"))
}

fun diaryGenerater(arg: String): String {
    val temple = """
   内容 $arg
   长度 ${arg.length}
    """.trimIndent()
    return temple
}