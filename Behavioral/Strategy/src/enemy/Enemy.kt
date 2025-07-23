package enemy

class Enemy(val name : String, private var health : Int = 100) {
    fun takeDamage(damage : Int) {
        if (health <= damage) {
            health = 0
            println("Enemy was killed")
            return
        }
        health -= damage
        println("Enemy got damage $damage")
    }
}