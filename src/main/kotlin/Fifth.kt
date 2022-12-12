fun main() {

    val numbers = intArrayOf(1, 200, 300, 4, 5, 6, 1000, -5, 2)
    var result = 0
    for (i in numbers) {
        if (i in -999..999) result++
    }
    println("Result is: $result")

}

/*
5. Count how many elements of the array A(N) have at most 3 digits.
 */