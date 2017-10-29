package heap
interface PriorityQueue {
    fun insert(x: Int)
    fun peek(): Int
    fun extractMax(): Int
    fun getHeap(): IntArray
}

class PriorityQueueImpl(arr: IntArray) : Heap(), PriorityQueue {

    companion object {

        private const val MAX = 15
    }

    private val heap = IntArray(heap.PriorityQueueImpl.Companion.MAX)
    private var heapSize: Int = 0

    init {
        for (i in 0 until arr.size) {
            heap[i] = arr[i]
        }
        heapSize = arr.size
        buildingHeap(heap)
    }

    override fun getHeap(): IntArray = heap.copyOf()

    override fun insert(x: Int) {
        heapSize += 1
        heap[heapSize - 1] = -Int.MAX_VALUE
        increaseKey(heapSize - 1, x)
    }

    override fun peek() = heap[0]

    override fun extractMax(): Int {
        val max = heap[0]
        heap[0] = heap[heapSize - 1]
        heapSize -= 1
        maxHeapify(0)
        return max
    }

    fun increaseKey(i: Int, v: Int) {
        if (heap[i] > v) throw Exception("Value is smaller than current value ${heap[i]}")
        heap[i] = v
        var j = i
        while (j > 0 && heap[parent(j)] < heap[j]) {
            val max = heap[j]
            heap[j] = heap[parent(j)]
            heap[parent(j)] = max
            j = parent(j)
        }
    }

    fun print() {
        print(heap, heapSize)
    }

    private fun maxHeapify(i: Int) {
        maxHeapify(heap, i , heapSize)
    }
}