
fun main() {

    val numbers = intArrayOf(1, 10, 3, 10, -5)
    var max = Int.MIN_VALUE
    for (i in numbers) {
        if (i > max) max = i
    }
    println("$max -> ${numbers.indexOf(max)}")

}

/*
31. Find the value of the largest element of a given array A(N)
and the number of the first element with that value.
 */