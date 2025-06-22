fun main() {
    val mainFile = File("Main.kt")
    val srcDirectory = Directory("src")
    val prototypeDirectory = Directory("Prototype")

    srcDirectory.addFile(mainFile)
    prototypeDirectory.addDirectory(srcDirectory)

    val gitHubRepository : Repository = GitHubRepository("Design Patterns")
    gitHubRepository.addDirectory(prototypeDirectory)

    val gitLabRepository : Repository = gitHubRepository.cloneRepository()

    gitLabRepository.getInfo()
}