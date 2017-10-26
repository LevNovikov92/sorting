class MergeSorting : Sorting {

    override fun sort(arr: IntArray): IntArray {
        val resultArr = IntArray(arr.size)
        TODO()
    }

    fun merge(arr: IntArray, l: Int, m: Int, r: Int): IntArray {
        val result = IntArray(r - l + 1)
        var i = l
        var j = m + 1
        var k = 0
        while (i <= m || j <= r) {
            val a = if (i <= m) arr[i] else null
            val b = if (j <= r) arr[j] else null
            if ((b == null && a!= null) || a <= b) {
                result[k] = a
                i++
            } else {
                result[k] = b
                j++
            }
            k++
        }
        return result
    }
}