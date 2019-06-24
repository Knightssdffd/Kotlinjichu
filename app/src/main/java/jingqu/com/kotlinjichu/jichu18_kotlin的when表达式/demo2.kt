package jingqu.com.kotlinjichu.jichu18_kotlin的when表达式

/**
 *  Created by  幻忧 on  2019/6/24 22:31
 */

fun main() {
pianduan("sdj")
}


fun pianduan(arg: String) {
    val type = """
        内容： $arg
        长度：${zhi(arg.length)}
    """.trimIndent()
    println(type)
}

fun zhi(arg: Int): String {
    when (arg) {
        1 -> return "一"
        2 -> return "二"
        3 -> return "三"
        else -> return arg.toString()
    }
}