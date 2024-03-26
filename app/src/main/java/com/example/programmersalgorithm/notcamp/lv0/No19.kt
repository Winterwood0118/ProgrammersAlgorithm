package com.example.programmersalgorithm.notcamp.lv0
// 조건 문자열
class No19 {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        return when{
            eq == "=" && ineq == ">" -> if (n >= m) 1 else 0
            eq == "=" && ineq == "<" -> if (n <= m) 1 else 0
            eq == "!" && ineq == ">" -> if (n > m) 1 else 0
            else -> if (n < m) 1 else 0
        }
    }
}

// a.compareTo(b)는 a가 b보다 크면 1을, 같으면 0을, 작으면 -1을 반환하는 메서드다. Boolean자료형은 true > false 로 취급한다.
/*
class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int = when ("$ineq$eq") {
        ">=" -> n >= m
        "<=" -> n <= m
        ">!" -> n > m
        else -> n < m
    }.compareTo(false)
}
}*/
