package main.quick

import main.Sorting

class QuickSorting : Sorting {

    override fun sort(arr: IntArray): IntArray {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun partition(arr: IntArray, l: Int, r: Int) {
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
        arr[r] = arr[i]
        arr[i] = x
    }
}