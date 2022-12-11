fun main() {

    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 4, 10, 13, 90)
    var result = 0
    for (i in numbers) {
        if (i in 10..99) result++
    }
    println("Result is: $result")

}

/*
4. Count how many elements of the array A(N) are positive two-digit numbers.
 */