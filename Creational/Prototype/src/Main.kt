import nodes.implementations.Directory
import nodes.implementations.File
import repositories.abstractRepository.Repository
import repositories.implementations.GitHubRepository

fun main() {
    val mainFile = File("Main.kt")
    val srcDirectory = Directory("src")
    val prototypeDirectory = Directory("Prototype")

    srcDirectory.addFile(mainFile)
    prototypeDirectory.addDirectory(srcDirectory)

    val gitHubRepository : Repository = GitHubRepository("Design Patterns", mutableListOf())
    gitHubRepository.addDirectory(prototypeDirectory)

    val gitLabRepository : Repository = gitHubRepository.cloneRepository()

    gitLabRepository.getInfo()

    gitHubRepository.showContent()

    gitLabRepository.showContent()
}