package repositories.implementations

import nodes.abstractClasses.Node
import repositories.abstractRepository.Repository

class GitLabRepository(name : String, content : MutableList<Node>)
    : Repository(name, content) {
    override fun getInfo() {
        println("This is a GitLab repository or a clone")
    }

    override fun cloneRepository(): Repository {
        val clone = GitLabRepository(this.name, this.getContent())
        return clone
    }
}