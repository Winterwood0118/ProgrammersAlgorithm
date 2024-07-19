package com.example.programmersalgorithm.notcamp.lv0

// 9로 나눈 나머지
class No38 {
    fun solution(number: String): Int {
        return number.sumOf { it.digitToInt() } % 9
    }
}

fun main(){
    println(No38().solution("123"))
}