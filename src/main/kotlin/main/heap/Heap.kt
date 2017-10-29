package main.heap

open class Heap {
    protected fun left(i: Int): Int = 2 * (i + 1) - 1

    protected fun right(i: Int): Int = 2 * (i + 1)

    protected fun parent(i: Int) = (i + 1) / 2 - 1

    fun maxHeapify(arr: IntArray, i: Int, heapSize: Int) {
        val leftIndex = left(i)
        val rightIndex = right(i)
        var max = if (leftIndex < heapSize && arr[leftIndex] > arr[i]) {
            leftIndex
        } else {
            i
        }

        if (rightIndex < heapSize && arr[rightIndex] > arr[max]) {
            max = rightIndex
        }
        if (max != i) {
            val maxValue = arr[max]
            arr[max] = arr[i]
            arr[i] = maxValue
            maxHeapify(arr, max, heapSize)
        }
    }

    fun buildingHeap(arr: IntArray) {
        val i = arr.size / 2 - 1
        for (k in i downTo 0) {
            maxHeapify(arr, k, arr.size)
        }
    }

    fun print(arr: IntArray, heapSize: Int) {

        fun addToMap(map: MutableMap<Int, MutableList<Int>>, offset: Int, i: Int) {
            val list = map[offset] ?: mutableListOf()
            list.add(i)
            map.put(offset, list)
        }

        fun traversAndPrint(i: Int, offset: Int, map: MutableMap<Int, MutableList<Int>>) {
            addToMap(map, offset, arr[i])
            if (left(i) < heapSize) {
                traversAndPrint(left(i), offset -1, map)
            }
            if (right(i) < heapSize) {
                traversAndPrint(right(i), offset -1, map)
            }
        }

        fun printList(mutableList: MutableList<Int>?, offset: Int) {
            if (mutableList != null) {
                val tab = " "
                var tabs = ""
                for (k in 0 until Math.pow(2.toDouble(), offset.toDouble()).toInt()) tabs += tab
                var line = ""
                mutableList.forEach { line += "$tabs$it$tabs" }
                System.out.println(line)
            }
        }

        fun printMap(map: MutableMap<Int, MutableList<Int>>) {
            map.keys.sortedDescending().forEach { printList(map[it], it) }
            System.out.println()
            System.out.println()
        }


        var offset = 0
        var s = heapSize
        while (s > 0) {
            s /= 2
            offset++
        }
        val map = mutableMapOf<Int, MutableList<Int>>()
        traversAndPrint(0, offset, map)
        printMap(map)
    }
}