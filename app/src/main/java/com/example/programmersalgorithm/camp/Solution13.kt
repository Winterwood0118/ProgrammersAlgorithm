package com.example.programmersalgorithm.camp
// 자릿수 더하기
class Solution13 {
    fun solution(n: Int): Int = n.toString().sumOf { it.digitToInt() }
}