import heap.PriorityQueueImpl
import org.junit.Assert
import org.junit.Test

import org.junit.Before

class PriorityQueueImplTest {

    private val heapArray: IntArray = intArrayOf(16,10,14,8,7,9,3,2,4,1)
    private lateinit var priorityQueue: PriorityQueueImpl

    @Before
    fun setUp() {
        priorityQueue = PriorityQueueImpl(intArrayOf(14, 8, 16, 10, 1, 9, 3, 2, 4, 7))
    }

    @Test
    fun insert() {
        priorityQueue.insert(17)
        priorityQueue.print()
    }

    @Test
    fun extractMax() {
        Assert.assertEquals(16, priorityQueue.extractMax())
        priorityQueue.print()
    }

    @Test
    fun increaseKey() {
        Assert.assertArrayEquals(heapArray, priorityQueue.getHeap().copyOf(heapArray.size))
        priorityQueue.increaseKey(6, 17)
        priorityQueue.print()
    }

}