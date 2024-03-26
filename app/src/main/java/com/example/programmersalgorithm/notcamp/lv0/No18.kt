package com.example.programmersalgorithm.notcamp.lv0
// 홀짝에 따라 다른 값 반환하기
class No18 {
    fun solution(n: Int): Int {
        return if (n % 2 == 0) (0..n step 2).sumOf { it*it }
        else (1..n step 2).sumOf { it }
    }
}