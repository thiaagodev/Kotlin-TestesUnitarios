fun countXO(str: String): Boolean {
    val strLower = str.lowercase()

    var i = 0
    var countX = 0
    var countO = 0

    for (str in strLower) {
        when(str) {
            'x' -> countX++
            'o' -> countO++
        }
    }

    return countO == countX && countO != 0
}

fun main() {
    println(countXO("xxoo"))
    println(countXO("xxooo"))
    println(countXO("aa"))
}