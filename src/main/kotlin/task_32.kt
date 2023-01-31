
fun main() {

    val numbers = intArrayOf(1, -5, -100, 10, -5, -100, 3)
    var min = Int.MAX_VALUE
    for (i in numbers) {
        if (i < min) min = i
    }
    println("$min -> ${numbers.lastIndexOf(min)}")

}

/*

32. Find the value of the smallest element of a given array A(N)
and the number of the last element with this value.
 */