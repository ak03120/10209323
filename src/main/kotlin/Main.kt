package io.github.ak03120

fun main() {
    bubbleSort()
    quickSort()
}

fun bubbleSort() {
    var input = (0..20).shuffled().toIntArray()
    println("バブルソート開始：${input.contentToString()}")
    val n = input.size
    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (input[j] > input[j + 1]) {
                // スワップ
                val temp = input[j]
                input[j] = input[j + 1]
                input[j + 1] = temp
                println("バブルソート中：${input.contentToString()}")
            }
        }
    }
    println("バブルソート完了：${input.contentToString()}")
}

fun quickSort() {
    var input = (0..20).shuffled().toIntArray()
    println("クイックソート開始：${input.contentToString()}")
    quickSortRecursive(input, 0, input.size - 1)
    println("クイックソート完了：${input.contentToString()}")
}

fun quickSortRecursive(input: IntArray, low: Int, high: Int) {
    val pivot = input[(low + high) / 2]
    var i = low
    var j = high
    var temp: Int
    while (i <= j) {
        while (input[i] < pivot) {
            i++
        }
        while (pivot < input[j]) {
            j--
        }
        if (i <= j) {
            println("クイックソート中：${input.contentToString()} PIVOT：${pivot}")
            temp = input[i]
            input[i] = input[j]
            input[j] = temp
            i++
            j--
        }
    }
    if (low < j) {
        quickSortRecursive(input, low, j)
    }
    if (i < high) {
        quickSortRecursive(input, i, high)
    }
}
