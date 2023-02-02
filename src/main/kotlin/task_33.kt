import kotlin.math.absoluteValue

fun main() {

    val numbers = intArrayOf(1, -5, -100, 10, -5, -100, 3)
    for (i in numbers.indices) numbers[i] = numbers[i].absoluteValue
    var max = Int.MIN_VALUE
    for (i in numbers) if (i > max) max = i
    println("$max -> ${numbers.indexOf(max)}")

}

/*
33. Find the value of the absolute largest element of a given array A(N)
and the number of the first element with such a value.
 */