
fun main() {

    val numbers = intArrayOf(1, 1, 1, 2, 4)
    val evenNums = numbers.count { it % 2 == 0 }
    if (evenNums < 1) println(-1) else {
        for (i in numbers.indices) {
            if (numbers[i] % 2 == 0) {
                println(i)
                break
            }
        }

    }
}

/*
26. Find the number of the first even element of the array A(N).
If no such element exists, -1 will be printed.
 */