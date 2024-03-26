package com.example.programmersalgorithm.notcamp.lv0
// n의 배수
class No16 {
    fun solution(num: Int, n: Int): Int {
        return if(num % n == 0) 1 else 0
    }
}