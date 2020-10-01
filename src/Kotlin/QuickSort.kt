package Kotlin

class QuickSort {
    fun partition(arr: IntArray, low: Int, high: Int): Int {
        val pivot = arr[high]
        var i = low - 1
        for (j in low until high) {
            if (arr[j] < pivot) {
                i++
                val temp = arr[i]
                arr[i] = arr[j]
                arr[j] = temp
            }
        }
        val temp = arr[i + 1]
        arr[i + 1] = arr[high]
        arr[high] = temp
        return i + 1
    }

    fun sort(arr: IntArray, low: Int, high: Int) {
        if (low < high) {
            val pi = partition(arr, low, high)
            sort(arr, low, pi - 1)
            sort(arr, pi + 1, high)
        }
    }

    companion object {
        fun printArray(arr: IntArray) {
            val n = arr.size
            for (i in 0 until n) print(arr[i].toString() + " ")
            println()
        }

        @JvmStatic
        fun main(args: Array<String>) {
            val arr = intArrayOf(64, 34, 25, 12, 22, 11, 90, 88)
            val n = arr.size
            println("Given Array")
            printArray(arr)
            val ob = QuickSort()
            ob.sort(arr, 0, n - 1)
            println("sorted array")
            printArray(arr)
        }
    }
}
