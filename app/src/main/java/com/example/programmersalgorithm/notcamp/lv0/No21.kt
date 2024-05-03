package com.example.programmersalgorithm.notcamp.lv0


// 코드 처리하기
class No21 {
    fun solution(code: String): String {
        val answer = StringBuilder()
        var mode = false
        for (idx in code.indices) {
            when (code[idx]) {
                '1' -> mode = !mode
                else -> {
                    if (idx % 2 == 0 && mode) {
                        answer.append(code[idx])
                    } else if (idx % 2 == 1 && !mode) {
                        answer.append(code[idx])
                    }
                }
            }
        }
        return if (answer.isEmpty()) "EMPTY" else answer.toString()
    }
}