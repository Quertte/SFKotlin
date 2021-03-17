package kot

fun main() {
    val birthDateGenerate = BirthDateGenerate()
    println(birthDateGenerate.generateDate())
}

class BirthDateGenerate {
    fun generateDate(): String {
        var date = ""

        repeat(10) {
            when (it) {
                0 -> {
                    for (i in 0..3) {
                        if (i == 0) {
                            date += i
                        }
                    }
                }
                1 -> {
                    for (i in 0..9) {
                        if (i == 1) {
                            date += i
                        }
                    }
                }
                2 -> date += "."
                3 -> {
                    for (i in 0..1) {
                        if (i == 0) {
                            date += i
                        }
                    }
                }
                4 -> {
                    for (i in 0..9) {
                        if (i == 1) {
                            date += i
                        }
                    }
                }
                5 -> date += "."
                6 -> {
                    for (i in 0..9) {
                        if (i == 1) {
                            date += i
                        }
                    }
                }
                7 -> {
                    for (i in 0..9) {
                        if (i == 9) {
                            date += i
                        }
                    }
                }
                8 -> {
                    for (i in 0..9) {
                        if (i == 7) {
                            date += i
                        }
                    }
                }
                9 -> {
                    for (i in 0..9) {
                        if (i == 0) {
                            date += i
                        }
                    }
                }
            }
        }

        return date
    }
}

