import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class MergeSortingTest {
    @Test
    fun merge() {
        val arr = intArrayOf(1,3,4,9,2,5,6,8)
        val result = MergeSorting().merge(arr, 0, 3, arr.size - 1)
        Assert.assertArrayEquals(intArrayOf(1,2,3,4,5,6,8,9), result)
    }

}