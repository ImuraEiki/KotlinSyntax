fun main () {
    swapCharArray(arrayOf('d', 'o', 'g', 'f', 'o', 'o', 'd'))
}

fun swapCharArray(chararr: Array<Char>): Array<Char> {
    // 与えられた配列の長さが1以下のとき
    if (chararr.size <= 1) return chararr
    // 両端から走らせる
    var front: Int = 0
    var end: Int = chararr.size - 1
    while (front < end) {
        swap(chararr, front, end)
        front++
        end--
    }
    return chararr
}

private fun swap(chararr: Array<Char>, front: Int, end: Int) {
    val frontChar: Char = chararr[front]
    chararr[front] = chararr[end]
    chararr[end] = frontChar
}