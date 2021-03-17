package kot

data class Character(val name:String, val profession :String) {

}

fun main() {
    val martinWarrior = Character("Martin", "Warrior")
    val(name, profession) = martinWarrior
    println("name: $name profession: $profession")
}