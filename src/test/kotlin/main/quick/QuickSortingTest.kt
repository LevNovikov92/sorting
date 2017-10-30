package main.quick

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class QuickSortingTest {

    private lateinit var sorting: QuickSorting

    @Before
    fun setUp() {
        sorting = QuickSorting()
    }

    @Test
    fun partition() {
        val arr = intArrayOf(2,8,7,1,3,5,6,4)
        sorting.partition(arr, 0, arr.size - 1)
        Assert.assertArrayEquals(intArrayOf(2,1,3,4,7,5,6,8), arr)
    }

}