package kot

fun main() {
    val lastNameDuplicates = LastNameDuplicates()

    lastNameDuplicates.thereCanBeOnlyOne()
}

class LastNameDuplicates {
    private val employeeList = listOf(
        Employee("Дмитрий", "Иванов", 30),
        Employee("Иван", "Петров", 22),
        Employee("Антон", "Сидоров", 24),
        Employee("Дмитрий", "Иваненко", 25),
        Employee("Дмитрий", "Иванов", 22),
        Employee("Алла", "Иванова", 21),
        Employee("Тамара", "Чернецкая", 43),
        Employee("Дмитрий", "Савушкин", 23),
        Employee("Петр", "Симакин", 43),
        Employee("Василий", "Иванов", 23),
        Employee("Соня", "Иванова", 54),
        Employee("Виктория", "Иванова", 64),
        Employee("Дарья", "петрова", 23),
        Employee("Дмитрий", "Иванов", 76),
        Employee("Дмитрий", "Иванов", 45),
        Employee("Дмитрий", "Иванов", 23),
        Employee("Дмитрий", "Иванов", 54),
        Employee("Серафима", "Ивушкина", 18),
        Employee("Наталья", "Иванова", 60),
        Employee("Борис", "Иванов", 34),
        Employee("Алина", "Сидорова", 23),
        Employee("Дмитрий", "Иванов", 65)
    )

    fun thereCanBeOnlyOne() {
        val duplicates = employeeList.distinctBy {
            Pair(it.name ,it.lastName)
        }
        println(duplicates)
    }
}


data class Employee(val name: String, val lastName: String, val age: Int)