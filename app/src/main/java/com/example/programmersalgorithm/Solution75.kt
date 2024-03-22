package com.example.programmersalgorithm


fun main(){
    val testList = "-1 1 2 4 -5"
    val test = Solution75()

    println(test.solution(testList))
}

class Solution75 {
    fun solution(s: String): String {
        var answer = ""
        answer = s.split(" ").map { it.toInt() }.run {
            "${maxOf{it}} ${minOf{it}}"
        }
        answer = s.split(" ").map { it.toInt() }.let {
            "${it.maxOf{it}} ${it.minOf{it}}"
        }
        return answer
    }
}