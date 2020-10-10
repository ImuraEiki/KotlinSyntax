fun main () {
    println(twoSum(arrayOf(13,32,54,876,432,678,321,45,321,324), 353))
}
// 配列の中から足すとtargetになる整数のペアを返す
fun twoSum(num: Array<Int>, target: Int): String {
    var map: MutableMap<Int, Int> = mutableMapOf() // (numのvalue, numのindex)
    var answer: String = ""
    for (i in num.indices) {
        // map内に、足すとtargerになるペアの数があるかチェック
        if (map.containsKey(target - num[i])) {
            answer = map.getValue(target - num[i]).toString() + "," + i.toString()
            return answer
        } else {
            map[num[i]] = i
        }
    }
    return answer
}