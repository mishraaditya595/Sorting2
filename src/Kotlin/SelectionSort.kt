package Kotlin

object SelectionSort {
    fun selectionSort(arr: IntArray) {
        for (i in 0 until arr.size - 1) {
            var index = i
            for (j in i + 1 until arr.size) {
                if (arr[j] < arr[index]) {
                    index = j //searching for lowest index
                }
            }
            val smallerNumber = arr[index]
            arr[index] = arr[i]
            arr[i] = smallerNumber
        }
    }

    @JvmStatic
    fun main(a: Array<String>) {
        val arr1 = intArrayOf(64, 34, 25, 12, 22, 11, 90, 88)
        println("Before Selection Sort")
        for (i in arr1) {
            print("$i ")
        }
        println()
        selectionSort(arr1) //sorting array using selection sort
        println("After Selection Sort")
        for (i in arr1) {
            print("$i ")
        }
    }
}