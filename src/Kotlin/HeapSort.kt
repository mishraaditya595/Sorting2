package Kotlin


class HeapSort {
    fun sort(arr: IntArray) {
        val n = arr.size
        for (i in n / 2 - 1 downTo 0) heapify(arr, n, i)
        for (i in n - 1 downTo 1) {
            val temp = arr[0]
            arr[0] = arr[i]
            arr[i] = temp
            heapify(arr, i, 0)
        }
    }

    fun heapify(arr: IntArray, n: Int, i: Int) {
        var largest = i
        val l = 2 * i + 1
        val r = 2 * i + 2
        if (l < n && arr[l] > arr[largest]) largest = l
        if (r < n && arr[r] > arr[largest]) largest = r
        if (largest != i) {
            val swap = arr[i]
            arr[i] = arr[largest]
            arr[largest] = swap
            heapify(arr, n, largest)
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
            val ob = HeapSort()
            ob.sort(arr)
            println("Sorted array is")
            printArray(arr)
        }
    }
}
