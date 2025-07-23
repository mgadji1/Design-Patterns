package battlefield

import enemy.Enemy
import strategies.interfaces.AttackStrategy

class BattleField {
    private val enemies : MutableList<Enemy> = mutableListOf()

    fun addEnemy(enemy: Enemy) {
        enemies.add(enemy)
    }

    fun attack(attackStrategy: AttackStrategy) {
        for (i in 0 until enemies.size) {
            attackStrategy.attack(enemies[i])
            enemies[i].takeDamage(attackStrategy.damage)
        }
    }
}