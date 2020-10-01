package Kotlin

class MergeSort {
    fun merge(arr: IntArray, l: Int, m: Int, r: Int) {
        val n1 = m - l + 1
        val n2 = r - m
        val L = IntArray(n1)
        val R = IntArray(n2)
        for (i in 0 until n1) L[i] = arr[l + i]
        for (j in 0 until n2) R[j] = arr[m + 1 + j]
        var i = 0
        var j = 0
        var k = l
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i]
                i++
            } else {
                arr[k] = R[j]
                j++
            }
            k++
        }
        while (i < n1) {
            arr[k] = L[i]
            i++
            k++
        }
        while (j < n2) {
            arr[k] = R[j]
            j++
            k++
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    fun sort(arr: IntArray, l: Int, r: Int) {
        if (l < r) {
            val m = (l + r) / 2
            sort(arr, l, m)
            sort(arr, m + 1, r)
            merge(arr, l, m, r)
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
            println("Given Array")
            printArray(arr)
            val ob = MergeSort()
            ob.sort(arr, 0, arr.size - 1)
            println("Sorted array")
            printArray(arr)
        }
    }
}
