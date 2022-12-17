fun main() {

    val a = intArrayOf(2, 1, 1, 2)
    val b = intArrayOf(1, 1, 1, 2)
    val c = intArrayOf(1, 1, 2, 4)
    val d = intArrayOf(3, 1, 2, 3)
    for (i in 0..3) {
        if (a[i] == b[i] && c[i] == d[i] && a[i] != c[i]) {
            println("${a[i]}${b[i]}${c[i]}${d[i]}")
        }
    }

}

/*
10. The arrays A(N), B(N), C(N) and D(N) contain the digits of the number plates of passenger cars, each number being (AiBiCiDi).
Find and print the lucky numbers. Example - 1122.
 */