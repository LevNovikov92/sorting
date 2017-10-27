class MergeSorting {

    fun merge(left: IntArray, right: IntArray) : IntArray {
        val result = IntArray(left.size + right.size)
        var i = 0
        var j = 0
        for (k in 0 until result.size) {
            val a = if (i < left.size) left[i] else null
            val b = if (j < right.size) right[j] else null
            if (a == null && b != null) {
                result[k] = b
                j++
            } else if (a != null && b == null) {
                result[k] = a
                i++
            } else if (a != null && b != null) {
                if (a <= b) {
                    result[k] = a
                    i++
                } else {
                    result[k] = b
                    j++
                }
            } else {
                throw Exception("Exception")
            }
        }
        return result
    }

    fun sort(arr: IntArray): IntArray {
        return if (arr.size == 1) {
            arr
        } else {
            val m = (arr.size - 1) / 2
            merge(sort(arr.copyOfRange(0, m + 1)), sort(arr.copyOfRange(m + 1, arr.size)))
        }
    }
}