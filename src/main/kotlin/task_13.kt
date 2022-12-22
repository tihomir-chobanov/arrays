fun main() {

    val numbers = intArrayOf(-4, - 3, - 5, 0, 5, 6)
    var result = 0.0
    var counter = 0.0
    for (i in numbers) {
        if (i > 0) {
            result += i
            counter++
        }
    }
    println("Result is: " + result / counter)

}

/*
13. Find the arithmetic mean of the positive numbers in the array.
 */