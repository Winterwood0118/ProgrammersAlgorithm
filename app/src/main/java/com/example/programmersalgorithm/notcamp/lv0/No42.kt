package com.example.programmersalgorithm.notcamp.lv0
// 배열 두배 만들기
class No42 {
    fun solution(numbers: IntArray): IntArray {
        return IntArray(numbers.size){ numbers[it] * 2 }
    }
    fun solution2(numbers: IntArray): IntArray {
        return numbers.map{ it * 2 }.toIntArray()
    }
}