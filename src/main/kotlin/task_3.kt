fun main() {

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 4)
    val p = 4
    val q = 6
    var result = 0
    for (i in numbers) {
        if (i in p..q) result++
    }
    println("Result is: $result")

}

/*
3. Count how many elements of the array A(N) are in the interval [P;Q].
 */