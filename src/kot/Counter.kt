package kot

fun main() {
    val counter = Counter()
    counter.countThree()
}

class Counter {
    private val list = mutableListOf<Int>()

    init {
        repeat(100) {
            list.add((1..3).random())
        }
    }

    fun countThree() {
        val threeCount = list.count{
            it == 3
        }
        println(threeCount)
    }
}