// Asked By Facebook [https://leetcode.com/problems/palindrome-number]
fun isPalindrome(x: Int): Boolean {
    if (x < 0 || (x != 0 && x % 10 == 0)) return false
    var revers = 0
    var number = x
    while (number > revers) {
        val lastDigit = number % 10
        revers = revers * 10 + lastDigit
        number /= 10
    }
    return (number == revers) || (number == revers / 10)
}

fun main() {
    println(isPalindrome(121))
    println(isPalindrome(-121))
    println(isPalindrome(10))
}