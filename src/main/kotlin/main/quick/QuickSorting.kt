package main.quick

import main.Sorting

class QuickSorting : Sorting {

    override fun sort(arr: IntArray): IntArray {
        quickSort(arr, 0, arr.size - 1)
        return arr
    }

    private fun quickSort(arr: IntArray, l: Int, r: Int) {
        if (l < r) {
            val i = partition(arr, l, r)
            quickSort(arr, l, i - 1)
            quickSort(arr, i + 1, r)
        }
    }

    fun partition(arr: IntArray, l: Int, r: Int): Int {
        val x = arr[r]
        var i = l - 1
        for (j in l until r) {
            if (arr[j] <= x) {
                i += 1
                val v = arr[j]
                arr[j] = arr[i]
                arr[i] = v
            }
        }
        i += 1
        arr[r] = arr[i]
        arr[i] = x
        return i
    }
}