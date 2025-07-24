package llms.implementations

import visitors.interfaces.ArtificialIntelligenceVisitor
import llms.interfaces.ArtificialIntelligence

class Claude : ArtificialIntelligence {
    override val name = "Claude"
    override fun accept(visitor: ArtificialIntelligenceVisitor) {
        visitor.visitClaude(this)
    }
}