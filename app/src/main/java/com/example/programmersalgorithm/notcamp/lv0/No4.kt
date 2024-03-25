package com.example.programmersalgorithm.notcamp.lv0
// 대소문자 바꿔서 출력하기
class No4 {
    fun main(args: Array<String>) {
        val s1 = readLine()!!.map{ it }
        val s2 = s1.map{
            if(it.isLowerCase()) it.toUpperCase()
            else it.toLowerCase()
        }.joinToString("")

        println(s2)
    }
}