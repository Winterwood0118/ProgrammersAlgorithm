package com.example.programmersalgorithm.camp

fun main() {
    val idListTest = arrayOf("muzi", "frodo", "apeach", "neo")
    val reportTest = arrayOf("muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi")
    val kTest = 2

    val test = Solution74()
    test.solution(idListTest,  reportTest, kTest)

}

class Solution74 {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
        val answer = IntArray(id_list.size)

        val reportedMap = mutableMapOf<String, Int>()
        id_list.forEachIndexed{ i, c ->
            reportedMap[c] = 0
        }

        //key: id와 value: index를 가지는 Map
        val idMap = mutableMapOf<String, Int>()
        id_list.forEachIndexed{ i, c ->
            idMap[c] = i
        }

        //key: id와 value: <id, 피신고횟수>를 가지는 2차원 맵
        val resultMap = mutableMapOf<String, MutableMap<String,Int>>()
        id_list.forEach{ c ->
            val innerMap = mutableMapOf<String, Int>()
            id_list.forEach {
                innerMap[it] = 0
            }
            resultMap[c] = innerMap
        }
        // 중복 제거후 split으로 쪼개기
        val reports = report.toList().distinct().map { it.split(" ") }.map { it[0] to it[1] }


        // 신고 받은 거 있으면 값 1로 바꾸기
        for (i in reports){
            resultMap[i.first]?.set(i.second, 1)
        }


        for( i in idMap){
            var reportedCount = 0
            resultMap.forEach{
                reportedCount += it.value[i.key]?:0
            }
            reportedMap[i.key] = reportedCount
        }

        reportedMap.forEach{(k1, v1) ->
            if (v1 >= k){
                resultMap.forEach{ (k2, v2) ->
                    if(v2[k1] == 1){
                        answer[idMap[k2]?:0] ++
                    }
                }
            }
        }
        return answer
    }
}