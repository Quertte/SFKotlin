package kot

fun main() {
    println("Hello World")
//    val  list: MutableList<Int> = mutableListOf(1,2,3,4)
//    list.add(5)
//    val  list1 : List<Int> = listOf(1,2,3,4)
//    val set: MutableMap<String, Int> = mutableMapOf("string" to 1)
//    val set2 = mutableSetOf<Int>(1,2,3,4,5)
//    set2.add(5)
//    val map = mutableMapOf(Pair("string", 1), Pair("string2", 2))
//    map.put("", 2)
//    print(map)
    val list = listOf(1, 2, 3, 4)
    val list2 = listOf(5, 6, 7, 8)
    val all = list + list2

    val seq = generateSequence(1) {
        if (it < 15) it + 1
        else null
    }

//    val result = 1
//    when {
//        result % 2 == 0 -> println("Even")
//        else -> println("Odd    ")
//    }
//    repeat(10) {
//        times ->
//        println(times)
//    }

    for (i in  list ) {
        println(i)
    }

}


