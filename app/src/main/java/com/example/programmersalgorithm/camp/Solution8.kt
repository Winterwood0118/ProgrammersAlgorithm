package com.example.programmersalgorithm.camp
// 각도기
class Solution8 {
    fun solution(angle: Int): Int = when(angle){
        in 0 until 90 -> 1
        90 -> 2
        180 -> 4
        else -> 3
    }
}