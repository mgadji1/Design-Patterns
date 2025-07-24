package llms.implementations

import visitors.interfaces.ArtificialIntelligenceVisitor
import llms.interfaces.ArtificialIntelligence

class DeepSeek : ArtificialIntelligence {
    override val name = "DeepSeek"
    override fun accept(visitor: ArtificialIntelligenceVisitor) {
        visitor.visitDeepSeek(this)
    }
}