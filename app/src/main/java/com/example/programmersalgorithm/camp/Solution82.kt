package com.example.programmersalgorithm.camp
// 멀리 뛰기
class Solution82 {
    fun solution(n: Int): Int {
        val fibonacci = IntArray(n + 1) { 1 }
        for (i in 2..n) {
            fibonacci[i] = (fibonacci[i - 2] + fibonacci[i - 1]) % 1234567
        }
        return fibonacci[n]
    }
}






/*
5(8)     6(13)
11111    111111
1112     11112
1121     11121
1211     11211
2111     12111
122      21111
212      1122
221      1212
         2112
         1221
         2121
         2211
         222
*/