fun romanToInt(s: String): Int {
    val map = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var result = 0
    val length = s.length
    for (i in 0..< length){
        if(i < length - 1) {
            if(map[s[i]]!! < map[s[i+1]]!!){
                result -= map.getValue(s[i])
            }else{
                result += map.getValue(s[i])
            }
        }else{
            result += map.getValue(s[i])
        }
    }
    return result
}

fun main() {
    println(romanToInt("MCMXCIV"))
}