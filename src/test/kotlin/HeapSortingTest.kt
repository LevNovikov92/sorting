import heap.HeapSorting
import org.junit.Assert
import org.junit.Test

class HeapSortingTest {

    private val heapArray: IntArray = intArrayOf(16,14,10,8,7,9,3,2,4,1)
    private val sortedArray: IntArray = intArrayOf(1,2,3,4,7,8,9,10,14,16)
    private val heapSorting = HeapSorting()

    @Test
    fun maxHeapify() {
        var arr = intArrayOf(1,4,10,14,7,9,3,2,8,1)
        heapSorting.print(arr, arr.size)
        heapSorting.maxHeapify(arr, 1, arr.size)
        Assert.assertArrayEquals(heapArray, heapArray)
    }

    @Test
    fun buildingHeap() {
        val arr = intArrayOf(4,1,3,2,16,9,10,14,8,7)
        heapSorting.buildingHeap(arr)
        Assert.assertArrayEquals(heapArray, arr)
    }

    @Test
    fun sort() {
        val arr = intArrayOf(4,1,3,2,16,9,10,14,8,7)
        Assert.assertArrayEquals(sortedArray, heapSorting.sort(arr))
    }
}