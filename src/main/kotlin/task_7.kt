fun main() {

    val numbers = intArrayOf(1, 203, 300, 4, 5, 6, 11, -5, 2)
    var result = 0
    for (i in numbers) {
        if (i % 10 == 3 || i % 10 == 1) result++
    }
    println("Result is: $result")

}

/*
7. Count how many elements of the array A(N) end with the digits 1 and 3 (not necessarily in that order).
 */