package jingqu.com.kotlinjichu.jichu20_kotlin的list和map入门

import java.util.*

/**
 *  Created by  幻忧 on  2019/6/24 22:56
 */


fun main() {
    val list = listOf<String>("aaaaaaaa", "bbbbbbb", "ssssssss")

    for ((aa, bb) in list.withIndex()) {
        println("$aa _-_  $bb")
    }

    val map = TreeMap<String, String>()
    map["aa"] = "111"
    map["bb"] = "222"
    map["cc"] = "333"


    println(map["bb"])

}
