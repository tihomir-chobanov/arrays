fun main() {
    val numbers = intArrayOf(1, 2, 3, 4, 5, 4)
    val b = 4
    var result = 0
    for (i in numbers) {
        if (i == b) result++
    }
    println("Result is: $result")
}

/*
1. Count how many elements of the array A(N) are equal to the number B.
 */