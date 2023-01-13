fun main() {

    val numbers = intArrayOf(4, 2, 3, 5, 2, 10, 50, -15, 0)
    val m = 5
    println("Before: ${numbers.joinToString(" ")}")
    for (i in numbers.indices) {
        if (numbers[i] < m) numbers[i] *= numbers[i]
        else if (numbers[i] == m) numbers[i] = -numbers[i]
        else numbers[i] = numbers[i - 1]
    }
    println("After: ${numbers.joinToString(" ")}")

}

/*
21. Write a program that convert a one-dimensional array of numbers A(N) as follows:
 the new value of Ai = Ai2 if Ai < M ,Ai= -Ai if Ai = M , Ai = Ai-1 if Ai > M .
 */