package repositories.implementations

import repositories.abstractRepository.Repository

class GitLabRepository(name : String) : Repository(name) {
    override fun getInfo() {
        println("This is a GitLab repository or a clone")
    }

    override fun cloneRepository(): Repository {
        val clone = GitLabRepository(this.name)
        return clone
    }
}