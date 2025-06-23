package repositories.implementations

import nodes.abstractClasses.Node
import repositories.abstractRepository.Repository

class GitHubRepository(name : String, content : MutableList<Node>)
    : Repository(name, content) {
    override fun getInfo() {
        println("This is a GitHub repository or a clone")
    }

    override fun cloneRepository(): Repository {
        val clone = GitHubRepository(this.name, this.getContent())
        return clone
    }
}