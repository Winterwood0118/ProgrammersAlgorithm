package com.example.programmersalgorithm.camp

// N개의 최소 곻배수



class Solution81 {
    fun solution(arr: IntArray): Int {
        var lcm = 1

        for (i in arr){
            lcm = (i * lcm) / gcd(i, lcm)
            println(lcm)
        }

        return lcm
    }

    tailrec fun gcd(a: Int, b: Int): Int {
        return if (b == 0) a else gcd(b, a % b)
    }



    fun solution2(arr: IntArray): Int {
        var answer = 1
        while(true) {
            var x = 0
            for(a in arr) x += answer%a
            if(x==0) return answer
            answer++
        }
    }
}