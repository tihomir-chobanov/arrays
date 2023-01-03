fun main() {

    val num1 = intArrayOf(1, 2, 3, 4)
    val num2 = intArrayOf(10, 10, 10, 10)
    val c = num1 + num2
    var result = 0
    for (i in c.indices) {
        if (i == num1.size) break
        result += c[i] * c[i + num1.size]
    }
    println("Result is: $result")

}

/*
14. Find the sum of the products of the corresponding elements of the vectors A(N) and B(N).
 */