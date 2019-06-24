package jingqu.com.kotlinjichu.jichu19_kotlin的loop和Range

/**
 *  Created by  幻忧 on  2019/6/24 22:42
 */

fun main() {
//    val zhi = 1..100 // [ 1,100]
//    var he = 0
//    for (s in zhi) {
//        he = he + s
//    }
//    println(he)

//    val zhi  = 1 until 100 //[1,100)
//    for (s in zhi){
//        println(s)
//    }
//    val zhi = 1 until 100 //[1,100)
//    step  步长
//    for (s in zhi step 2) {
//        println(s)
//    }


    val zhi = 1 until 100
    //翻转
    val reversed = zhi.reversed()
    for (s in reversed) {
        print("$s ,")
    }


}


