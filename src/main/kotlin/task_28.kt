
fun main() {

    val numbers = intArrayOf(1, 1, 1, 0, 4, 0, 2, 3, -10)
    val zeros = numbers.count { it == 0 }
    if (zeros < 1) println(-1) else {
        for (i in numbers.indices) {
            if (numbers[i] == 0) {
                println(i)
                break
            }
        }
    }

}

/*
28. Find the number of the first zero element of the array A(N).
If no such element exists, -1 will be printed.
 */