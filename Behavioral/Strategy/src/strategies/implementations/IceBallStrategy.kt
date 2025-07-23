package strategies.implementations

import enemy.Enemy
import strategies.interfaces.AttackStrategy

class IceBallStrategy(override val damage : Int) : AttackStrategy {
    override fun attack(enemy: Enemy) {
        println("Ice ball! Enemy ${enemy.name} got damage: $damage")
    }
}