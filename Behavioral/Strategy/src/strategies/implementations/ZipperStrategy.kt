package strategies.implementations

import enemy.Enemy
import strategies.interfaces.AttackStrategy

class ZipperStrategy(override val damage : Int) : AttackStrategy {
    override fun attack(enemy: Enemy) {
        println("Zipper! Enemy ${enemy.name} got damage: $damage")
    }
}