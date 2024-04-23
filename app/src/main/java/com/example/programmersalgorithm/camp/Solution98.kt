package com.example.programmersalgorithm.camp

import java.util.Stack
import kotlin.time.Duration.Companion.seconds

//뒤에 있는 큰 수 찾기
fun main() {
    val testArray = intArrayOf(2, 3, 3, 5)

    println(Solution98().solution(testArray).toList())
}

class Solution98 {
    /*
    fun solution(numbers: IntArray): IntArray {
            val answer: IntArray = IntArray(numbers.size) { 0 }
            for (i in numbers.indices){
                val number = numbers.slice(i..numbers.lastIndex).firstOrNull{ it > numbers[i] }?: -1
                answer[i] = number
            }
            return answer
        }
        */
    fun solution(numbers: IntArray): IntArray {
        val answer: IntArray = IntArray(numbers.size) { -1 }
        val numbersWithIndex = numbers.mapIndexed { i, c -> i to c }.toTypedArray()
        val stack = Stack<Pair<Int, Int>>()
        for (i in numbersWithIndex) {
            if (stack.isEmpty()) stack.push(i)
            else {
                var peek = stack.peek()
                while (peek.second < i.second) {
                    answer[peek.first] = i.second
                    stack.pop()
                    if (stack.isEmpty()) break
                    peek = stack.peek()
                }
                stack.push(i)
            }
        }

        return answer
    }
}