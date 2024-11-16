fun reverse(x: Int): Int {
    val max = Int.MAX_VALUE
    val min = Int.MIN_VALUE
    var value = x
    if(value == max || value == min) return 0
    var reverseValue = 0
    while (value != 0){
        val lastDigit = value%10
        if(reverseValue > max/10 || reverseValue < min/10) return 0
        reverseValue = reverseValue * 10 + lastDigit
        value /= 10
    }
    return reverseValue
}

fun main() {
    println(reverse(123))
}