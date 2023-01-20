import java.math.BigDecimal
import java.math.RoundingMode

fun main() {

    val numbers = intArrayOf(3, 13, 26, 4, 5, 20, 100, 9)
    val y = DoubleArray(numbers.size - 2)
    for (i in y.indices) {
        y[i] = (numbers[i] + numbers[i + 1] + numbers[i + 2]) / 3.0
        val a: BigDecimal = y[i].toBigDecimal()
        print("${a.setScale(2, RoundingMode.CEILING)} ")

    }
}

/*
24. Given the array X(N). Calculate for i=2,...,N-1.
The elements of the X array are replaced with the newly obtained Y,
leaving X1 and XN unchanged. If possible, don't use the Y array.
/see the screenshot/
 */