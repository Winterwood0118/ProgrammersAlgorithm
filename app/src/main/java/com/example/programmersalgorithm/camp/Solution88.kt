package com.example.programmersalgorithm.camp

// 배열의 곱셈
fun main() {
    val sol = Solution88()
    val test = arrayOf(
        intArrayOf(1, 4),
        intArrayOf(3, 2),
        intArrayOf(4, 1)
    )
    val test2 = arrayOf(
        intArrayOf(3, 3),
        intArrayOf(3, 3)
    )

    println(Solution88().solution(test, test2).toList())
}

class Solution88 {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        val answer = Array(arr1.size) {//행 갯수
            IntArray(arr2[0].size) { 0 } // 열 갯수
        }
        for (i in answer.indices) {
            for (j in answer[0].indices) {
                var sum = 0
                for (k in arr1[0].indices) {
                    sum += arr1[i][k] * arr2[k][j]
                }
                answer[i][j] = sum
            }
        }

        return answer
    }

    fun solution2(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = arrayOf<IntArray>()
        var answer2 = Array(arr1.size, {IntArray(arr2[0].size, {0})})

        var sum : Int = 0

        for(i in 0..arr1.size-1 step 1){
            for(j in 0..arr2[0].size-1 step 1){

                for(k in 0..arr1[0].size-1)
                {
                    sum += arr1[i][k] * arr2[k][j]
                }
                answer2[i][j] = sum
                sum = 0
            }
        }
        answer = answer2

        return answer
    }
}