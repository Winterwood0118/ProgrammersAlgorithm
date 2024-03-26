package com.example.programmersalgorithm.camp

//피보나치 수
class Solution78 {
    fun solution(n: Int): Int {
        val fibonacci = Array<Int>(n+1){0}
        fibonacci[1] = 1
        for (i in 2..n) {
            fibonacci[i] = (fibonacci[i - 2] + fibonacci[i - 1]) % 1234567
        }
        return fibonacci[n]
    }
}