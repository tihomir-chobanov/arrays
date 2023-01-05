fun main() {

    val numbers = intArrayOf(4, 2, 3, 5)
    for (i in numbers.indices) {
        numbers[i] *= i
    }
    println(numbers.joinToString(" "))

}

/*
19. Given the array A(N). Transform it by multiplying each element by its index.
 */