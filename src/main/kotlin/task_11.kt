fun main() {

    val numbers = intArrayOf(10, 10, 2, 3)
    var s1 = 0
    var s2 = 0
    for (i in numbers.indices) {
        if (i % 2 == 0) s1 += numbers[i] else s2 += numbers[i]
    }
    println("s1 is $s1")
    println("s2 is $s2")
    if (s1 > s2) println("s1 > s2")
    else if (s2 > s1) println("s2 > s1")
    else println("s1 = s2")

}

/*
11. Given the array A(N). Form: S1=A1+A3+A5+... and S2=A2+A4+A6+... and compare them.
 */