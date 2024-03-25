package com.example.programmersalgorithm.camp

import java.lang.StringBuilder

fun main() {
    val testS = "110010101001"
    val test = Solution77()
    /*    var test2 = ""

        test2 += '0'*/

    println(test.solution(testS).toList())

}

class Solution77 {
    fun solution(s: String): IntArray = binaryCount(s)/*{
        var answer: IntArray = intArrayOf()
        var count = 0
        var countOfZero = 0
        var result = s
        while (result != "1") {
            val sb = StringBuilder()
            for (i in result) {
                if (i == '0') {
                    countOfZero++
                } else {
                    sb.append(i)
                }
            }
            count++
            result = sb.toString().length.toString(2)
        }
        answer += count
        answer += countOfZero
        return answer
    }*/
    tailrec fun binaryCount(s: String, countInput: Int = 0, countOfZeroInput: Int = 0): IntArray {
        var count = countInput
        var countOfZero = countOfZeroInput
        val sb = StringBuilder()
        for (i in s) {
            if (i == '0')countOfZero++
            else sb.append(i)
        }
        count++
        val result = sb.toString().length.toString(2)
        return if (result == "1") intArrayOf(count, countOfZero) else binaryCount(result, count, countOfZero)
    }
}
