package main.quick

import main.MergeSorting
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

    @Test
    fun sort() {
        val arr = intArrayOf(1,3,8,9,2,5,3,6)
        val result = QuickSorting().sort(arr)
        Assert.assertArrayEquals(intArrayOf(1,2,3,3,5,6,8,9), result)
    }

}