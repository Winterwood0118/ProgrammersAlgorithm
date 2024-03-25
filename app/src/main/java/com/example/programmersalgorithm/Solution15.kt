package com.example.programmersalgorithm
// 나머지가 1이 되는 수 찾기
class Solution15 {
    fun solution(n: Int): Int {
        var answer: Int = 0
        if(n in 3 .. 1000000){
            for(i in 1..n){
                if(n%i == 1){
                    answer = i
                    break
                }
            }
        }
        return answer
    }
}