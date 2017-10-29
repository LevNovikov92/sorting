import main.MergeSorting
import org.junit.Assert
import org.junit.Test

class MergeSortingTest {

    @Test
    fun merge() {
        val arr = intArrayOf(1,3,4,9,2,5,6,8)
        val result = MergeSorting().merge(arr.copyOfRange(0, 4), arr.copyOfRange(4, 8))
        Assert.assertArrayEquals(intArrayOf(1,2,3,4,5,6,8,9), result)
    }

    @Test
    fun sort() {
        val arr = intArrayOf(1,3,8,9,2,5,3,6)
        val result = MergeSorting().sort(arr)
        Assert.assertArrayEquals(intArrayOf(1,2,3,3,5,6,8,9), result)
    }
}