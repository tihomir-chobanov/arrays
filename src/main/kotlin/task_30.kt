
fun main() {

    val numbers = intArrayOf(1, 1, 4, 2, -1)
    var result = false
    for (i in 0..numbers.size - 2) {
        if (numbers[i] * numbers[i + 1] < 0) {
            result = true
            break
        }
    }
    println(result)


}

/*
30. Check if an array A(N) has a pair of elements with different signs.
 */