package strategies.interfaces

import enemy.Enemy

interface AttackStrategy {
    val damage : Int
    fun attack(enemy : Enemy)
}