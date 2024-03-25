package com.example.programmersalgorithm.notcamp.lv0
// 문자열 반복해서 출력하기
class No3 {
    fun main(args: Array<String>) {
        val input = readLine()!!.split(' ')
        val s1 = input[0]
        val a = input[1]!!.toInt()
        repeat(a){
            print(s1)
        }
    }
}