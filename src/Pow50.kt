fun myPow(x: Double, n: Int): Double {
    return Math.pow(x,n.toDouble())
}

fun main() {
    println(myPow(2.0, -2147483647))
}