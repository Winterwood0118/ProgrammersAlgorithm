package com.example.programmersalgorithm.notcamp.lv0

// 카운트 업
class No32 {
    fun solution(start_num: Int, end_num: Int): IntArray =
        IntArray(end_num - start_num + 1) { it + start_num }
}