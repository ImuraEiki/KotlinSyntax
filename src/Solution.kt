fun main(){
    println(containsDup(arrayOf(1, 2, 3, 4, 3)))
}

fun containsDup(num: Array<Number>): Boolean {
    // 配列の要素数が0か1の場合はreturn
    if (num.size <= 1) return false

    // 空のマップを定義する
    var dupMap: MutableMap<Number, Boolean> = mutableMapOf()

    // ループ開始
    for(i in num.indices) {
        // マップが配列の要素を含んでいるかチェック
        if (dupMap.containsKey(num[i as Int])) return true
        // マップに配列の要素を格納
        dupMap[num[i]] = true
    }
    return false
}
