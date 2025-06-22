class GitHubRepository(name : String) : Repository(name) {
    override fun getInfo() {
        println("This is a GitHub repository or a clone")
    }

    override fun cloneRepository(): Repository {
        val clone = GitHubRepository(this.name)
        return clone
    }
}