package com.example.programmersalgorithm.notcamp.lv0
//덧셈 식 출력하기
class No6 {
    fun main(args: Array<String>) {
        val (a, b) = readLine()!!.split(' ').map(String::toInt)
        println("$a + $b = ${ a + b }")
    }
}