package com.example.programmersalgorithm.camp
// 약수의 합
class Solution14 {
    fun solution(n: Int): Int = (1..n / 2).filter{ n % it == 0 }.sumOf{ it } + n
}