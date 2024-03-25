package com.example.programmersalgorithm.notcamp.lv0
// 홀짝 구분하기
class No9 {
    fun main(args: Array<String>) {
        val a = readLine()!!.toInt()
        val evenOdd = if(a%2 == 0) "is even" else "is odd"

        println("$a $evenOdd")
    }
}