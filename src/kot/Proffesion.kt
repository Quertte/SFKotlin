package kot

fun main() {
    val dividerTask = DividerTask()

    dividerTask.divideAndPrint()
}

class DividerTask {
    val list = listOf(
        Person("Ann", "Builder"),
        Person("Bob", "Worker"),
        Person("Judy", "Builder"),
        Person("Doris", "Worker"),
        Person("Tommy", "Worker"),
        Person("Jim", "Builder"),
        Person("Sam", "Worker"),
        Person("Colin", "Builder"),
        Person("Connor", "Worker"),
        Person("Vick", "Builder"),
        Person("Polly", "Worker"),
        Person("Angela", "Builder")
    )

    fun divideAndPrint() {
        val prof = list.groupBy { it.profession }
        println("Builders :" + prof["Builder"])
        println("Workers :" + prof["Worker"])
    }
}


data class Person(val name: String, val profession: String)