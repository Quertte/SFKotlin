package kot

fun main() {
    val shooter = Shooter(object : Gun {
        override fun shoot() {
            println("KABOOM")
        }

        override fun reload() {
            println("wank - wank")
        }

    })
    shooter.shooterGun.shoot()
    shooter.shooterGun.reload()
}



class Shooter(var shooterGun :Gun)


interface Gun {
    fun shoot()
    fun reload()
}