fun main() {

    val numbers = intArrayOf(4, 2, 3, 5, 10, 50, -15, 0)
    val num = 3
    for (i in numbers.indices) {
        numbers[i] = numbers[i] % num
    }
    println(numbers.joinToString(" "))

}

/*
20. Given an array A(N).
Get an array B(N) with the remainders of dividing its elements by a given number.
 */