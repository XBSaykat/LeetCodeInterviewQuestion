// Asked By Microsoft [https://leetcode.com/problems/factorial-trailing-zeroes]
fun trailingZeroes(n: Int): Int {
    var ans = 0
    var powerOf5 = 5
    while (n >= powerOf5){
        ans += (n / powerOf5)
        powerOf5 *= 5
    }
    return ans
}

fun main() {
    println(trailingZeroes(5))
    println(trailingZeroes(25))
    println(trailingZeroes(50))
    println(trailingZeroes(75))
    println(trailingZeroes(100))
    println(trailingZeroes(125))
    println(trailingZeroes(150))
    println(trailingZeroes(200))
    println(trailingZeroes(225))
}