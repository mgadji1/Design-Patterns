import battlefield.BattleField
import enemy.Enemy
import strategies.implementations.FireBallStrategy
import strategies.implementations.IceBallStrategy
import strategies.implementations.ZipperStrategy

fun main() {
    val battleField = BattleField()

    val enemy1 = Enemy("enemy1")
    val enemy2 = Enemy("enemy2")
    val enemy3 = Enemy("enemy3")
    val enemy4 = Enemy("enemy4")

    battleField.addEnemy(enemy1)
    battleField.addEnemy(enemy2)
    battleField.addEnemy(enemy3)
    battleField.addEnemy(enemy4)

    battleField.attack(FireBallStrategy(20))
    battleField.attack(IceBallStrategy(15))
    battleField.attack(ZipperStrategy(30))
    battleField.attack(IceBallStrategy(30))
    battleField.attack(FireBallStrategy(5))
}