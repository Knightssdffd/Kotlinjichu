package jingqu.com.kotlinjichu.jichu16_kotlin字符串比较

/**
 *  Created by  幻忧 on  2019/6/24 22:12
 */
fun main() {
    val aa = "aaaaaa"
    val bb = "bbbbbb"
    val cc = "aaaaaa"
    val dd = "AAAaaa"
    // ==  判断字符串值是否相等
    println(aa == bb)
    println(aa == cc)
    //                ignoreCase 是否忽略大小写
    println(aa.equals(cc, true))
    println(aa.equals(dd, false))


}