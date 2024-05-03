package com.example.programmersalgorithm.notcamp.lv0
// 주사위 게임 2
class No23 {
    fun solution(a: Int, b: Int, c: Int): Int {
        return when{
            a == b && b == c -> ( a + b + c ) * ( a * a + b * b + c * c ) * ( a * a * a + b * b * b + c * c * c )
            a == b -> ( a + b + c ) * ( a * a + b * b + c * c )
            b == c -> ( a + b + c ) * ( a * a + b * b + c * c )
            c == a -> ( a + b + c ) * ( a * a + b * b + c * c )
            else -> a + b + c
        }
    }
    fun solution2 (a: Int, b: Int, c: Int): Int {
        return intArrayOf(a, b, c).toSet().run{
            when(this.size){
                1-> ( a + b + c ) * ( a * a + b * b + c * c ) * ( a * a * a + b * b * b + c * c * c )
                2-> ( a + b + c ) * ( a * a + b * b + c * c )
                else -> a + b + c
            }
        }
    }
}