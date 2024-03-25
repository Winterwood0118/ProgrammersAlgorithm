package com.example.programmersalgorithm.camp

// 나머지가 1이 되는 수 찾기
class Solution15 {
    fun solution(n: Int): Int = (1..n). first { n % it == 1 }
}