fun main() {

    val numbers = intArrayOf(1, 2, 10, 3, 5, 7, -10)
    var sum = 0
    for (j in numbers.indices) {
        sum += numbers[j]
        numbers[j] = sum
    }
    println(numbers.joinToString(" "))

}

/*
22. Given an array A(N). Find an array C for which C1=A1,C2=A1+A2, C3=A1+A2+A3, …
 */