package Kotlin

object InsertionSort {
    fun insertionSort(array: IntArray) {
        val n = array.size
        for (j in 1 until n) {
            val key = array[j]
            var i = j - 1
            while (i > -1 && array[i] > key) {
                array[i + 1] = array[i]
                i--
            }
            array[i + 1] = key
        }
    }

    @JvmStatic
    fun main(a: Array<String>) {
        val arr1 = intArrayOf(64, 34, 25, 12, 22, 11, 90, 88)
        println("Before Insertion Sort")
        for (i in arr1) {
            print("$i ")
        }
        println()
        insertionSort(arr1)
        println("After Insertion Sort")
        for (i in arr1) {
            print("$i ")
        }
    }
}
