import kotlin.math.absoluteValue

fun main() {

    val numbers = intArrayOf(1, -5, -100, 10, 1, -5, -100, 3)
    for (i in numbers.indices) numbers[i] = numbers[i].absoluteValue
    var min = Int.MAX_VALUE
    for (i in numbers) if (i < min) min = i
    println("$min -> ${numbers.lastIndexOf(min)}")

}

/*
34. Find the value of the absolute smallest element of a given array A(N)
and the number of the last element with such a value.
 */