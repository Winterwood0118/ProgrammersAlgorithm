package com.example.programmersalgorithm.camp
// 예상 대진표
fun main(){
    val a = 5 // 0101
    val b = 3 // 0011
    println((a-1) xor (b-1)) // 0100 xor 0010 = 0110 = 6, -1을 하는 것은 인덱스 시작을 0부터 하기 위해서
    println(((a-1) xor (b-1)).toString(2))
    println(((a-1) xor (b-1)).toString(2).length)

}

class Solution80 {
    fun solution(n: Int, a: Int, b: Int): Int {
        var answer = 1
        var numA = a
        var numB = b

        while (true) {
            if (numA - numB == 1 && numA % 2 == 0) break
            else if (numB - numA == 1 && numB % 2 == 0) break
            else {
                numA = (numA + 1) / 2
                numB = (numB + 1) / 2
                answer++
            }
        }

        return answer
    }
    fun solution2(n: Int, a: Int, b: Int) = ((a - 1) xor (b - 1)).toString(2).length

    fun solution3(n: Int, a: Int, b: Int): Int {
        var answer = 0
        var x = a
        var y = b
        while (x != y) {
            x = (x + 1) / 2
            y = (y + 1) / 2
            answer++
        }
        return answer

    }
}