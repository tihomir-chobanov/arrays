fun main() {

    val numbers = intArrayOf(3, 1, 1, 3, 2, 3, 0, 0)
    val counts = IntArray(4)
    for (evaluation in 0..3) {
        counts[evaluation] = numbers.count { it == evaluation }
        println("$evaluation group - ${counts[evaluation]}")
    }

}

/*
9. The array A(N) encodes the hair colors of a group of people (0-blonde, 1-red, 2-auburn, 3-black).
Determine the number of people in each group.
 */