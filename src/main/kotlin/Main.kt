fun main() {
    print(solution(mutableListOf(1, 3, 2, 4), 3))
}

fun solution(inputArray: MutableList<Int>, k: Int): Int {
    var maxSum = -1
    for (i in 0 until inputArray.size - (k - 1)) {
        var innerSum = 0
        for (j in 0 until k) {
            innerSum += inputArray[i + j]
        }
        if (innerSum > maxSum) {
            maxSum = innerSum
        }
    }
    return maxSum
}