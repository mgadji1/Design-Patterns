package visitors.implementations

import llms.implementations.ChatGPT
import llms.implementations.Claude
import llms.implementations.DeepSeek
import visitors.interfaces.ArtificialIntelligenceVisitor

class TextAnalyzer : ArtificialIntelligenceVisitor {
    override fun visitChatGPT(chatGPT: ChatGPT) {
        println("${chatGPT.name} was powered by text analyzer")
    }

    override fun visitDeepSeek(deepSeek: DeepSeek) {
        println("${deepSeek.name} was powered by text analyzer")
    }

    override fun visitClaude(claude: Claude) {
        println("${claude.name} was powered by text analyzer")
    }

}