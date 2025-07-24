package llms.implementations

import visitors.interfaces.ArtificialIntelligenceVisitor
import llms.interfaces.ArtificialIntelligence

class ChatGPT : ArtificialIntelligence {
    override val name = "ChatGPT"
    override fun accept(visitor: ArtificialIntelligenceVisitor) {
        visitor.visitChatGPT(this)
    }
}