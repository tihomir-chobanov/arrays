fun main() {

    val numbers = intArrayOf(1, 203, 300, 4, 5, 6, 1000, -5, 2)
    var result = 0
    for (i in numbers) {
        if (i % 10 == 3) result++
    }
    println("Result is: $result")

}

/*
6. Count how many elements of the array A(N) have last digit 3.
 */