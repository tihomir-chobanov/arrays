fun main() {

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 4)
    val p = 4
    val q = 6
    var result = 0
    for (i in numbers) {
        if (i > p && i < q) result++
    }
    println("Result is: $result")

}

/*
2. Count how many numbers from the array A(N) are in the interval (P;Q).
 */