package com.example.programmersalgorithm.notcamp.lv0
// 공배수
class No17 {
    fun solution(number: Int, n: Int, m: Int): Int {
        return if(number % n == 0 && number % m ==0) 1 else 0
    }
}