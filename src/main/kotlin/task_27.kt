
fun main() {

    val numbers = intArrayOf(1, 1, -3, 2, 4, 3, 2, 0, -10)
    val positiveNums = numbers.count { it > 0 }
    if (positiveNums < 1) println(-1) else {
        for (i in numbers.size - 1 downTo 0) {
            if (numbers[i] > 0) {
                println(i)
                break
            }
        }
    }

}

/*
27. Find the number of the last positive element of the array A(N).
If no such element exists, -1 will be printed.
 */