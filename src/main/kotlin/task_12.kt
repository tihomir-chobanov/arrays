fun main() {

    val numbers = intArrayOf(-4, - 3, - 5, 0, 5, 3)
    var result = 0
    for (i in numbers) {
        if (i < 0 && i % 2 != 0) result += i
    }
    println("Result is: $result")

}

/*
12. Find the sum of the odd negative elements of the array A(N).
 */