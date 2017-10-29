package heap

class HeapSorting : Heap(), Sorting {

    override fun sort(arr: IntArray): IntArray {
        buildingHeap(arr)
        for (i in arr.size - 1 downTo 1) {
            val max = arr[0]
            arr[0] = arr[i]
            arr[i] = max
            maxHeapify(arr, 0, i)
        }
        return arr
    }
}