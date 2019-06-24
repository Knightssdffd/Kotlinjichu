package jingqu.com.kotlinjichu.jichu18_kotlin的when表达式

/**
 *  Created by  幻忧 on  2019/6/24 22:27
 */


fun main() {
    pianduan(6)
}


fun pianduan(arg: Int) {
    when (arg) {
        8 -> println("aaaaaaaaaaa")
        7 -> println("bbbbbbbbbbb")
        6 -> println("ccccccccccc")
        else -> println("00000000000")
    }

}