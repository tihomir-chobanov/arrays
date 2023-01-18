fun main() {

    val num1 = intArrayOf(1, 2, 10, 0, 5, 7, -10)
    val num2 = intArrayOf(1, 4, 10, 3, 4, 0, -2)
    val c = IntArray(num1.size) { 0 }
    for (i in num1.indices) {
        if (num1[i] != 0 && num2[i] !=0 ) c[i] = num1[i] * num2[i]
        else if (num1[i] == 0 || num2[i] == 0) c[i] = 1
    }
    println(c.joinToString(" "))

}

/*
23. Given the arrays A(N) and B(N).
Form the array C as follows: Ci = Ai.Bi for Ai <> 0 and Bi <> 0 and 1 for Ai = 0 or Bi = 0
 */