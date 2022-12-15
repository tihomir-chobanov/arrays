fun main() {

    val numbers = intArrayOf(1, 2, 0, 5, 3)
    var result = 1
    for (i in numbers) {
        if (i != 0) result *= i
    }
    println("Result is: $result")

}

/*
8. Multiply those elements of the array A(N) that are not equal to zero.
 */