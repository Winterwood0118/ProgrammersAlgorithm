package com.example.programmersalgorithm.camp

import java.util.Stack

//괄호 회전하기

fun main() {
    print("abcde".toMutableList())
}

class Solution84 {
    fun solution(s: String): Int {
        var answer: Int = 0
        val sList = s.toMutableList()

        for (i in s.indices) {
            var isCorrect = false
            val sStack = Stack<Char>()
            sStack.push('a')
            for (j in sList) {
                when (j) {
                    ']' -> {
                        if (sStack.pop() != '[') {
                            isCorrect = false
                            break
                        }
                    }

                    '}' -> {
                        if (sStack.pop() != '{') {
                            isCorrect = false
                            break
                        }
                    }

                    ')' -> {
                        if (sStack.pop() != '(') {
                            isCorrect = false
                            break
                        }
                    }
                    else -> sStack.push(j)
                }
                if(sStack.size == 1) isCorrect = true
                else isCorrect = false
            }
            if (isCorrect) answer++

            sList.add(sList[0])
            sList.removeAt(0)

        }
        return answer
    }
}