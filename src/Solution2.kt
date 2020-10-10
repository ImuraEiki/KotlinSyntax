fun main(){
    println(nonRepeatingChar("aiueokakikukezkosaisuseos"))
}

fun nonRepeatingChar(str: String): Int {
    // strが1のときは0を返す
    if (str.length == 1) return 0

    // strを1文字ずつに分割してmapに格納する
    var splitMap: MutableMap<Char, Int> = mutableMapOf()

    for (i in str.indices) {
        // mapに無かったらcount1として格納
        if (!splitMap.containsKey(str[i])) {
            splitMap.put(str[i], 1)
        } else {
            // mapにあったらcountを1足す
            splitMap.put(str[i], splitMap.getValue(str[i]) + 1)
        }
    }

    // splitMapをリニアスキャンして、最初に見つけたcount1のindexをreturn
    for(i in str.indices) {
        if (splitMap.getValue(str[i]) == 1) {
            return i
        }
    }
    //　発見できなかったら-1をreturn
    return -1
}
