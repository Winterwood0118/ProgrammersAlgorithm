package com.example.programmersalgorithm.notcamp.lv0
// a와 b 출력하기
class No2 {
    fun main(args: Array<String>) {
        val (a, b) = readLine()!!.split(' ').map(String::toInt)
        println("a = $a")
        println("b = $b")
    }
}