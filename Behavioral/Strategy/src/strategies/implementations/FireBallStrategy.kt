package strategies.implementations

import enemy.Enemy
import strategies.interfaces.AttackStrategy

class FireBallStrategy(override val damage : Int) : AttackStrategy {
    override fun attack(enemy: Enemy) {
        println("Fireball! Enemy ${enemy.name} got damage: $damage")
    }
}