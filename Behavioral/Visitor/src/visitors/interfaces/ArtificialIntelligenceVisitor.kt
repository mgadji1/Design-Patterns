package visitors.interfaces

import llms.implementations.ChatGPT
import llms.implementations.Claude
import llms.implementations.DeepSeek

interface ArtificialIntelligenceVisitor {
    fun visitChatGPT(chatGPT : ChatGPT)
    fun visitDeepSeek(deepSeek : DeepSeek)
    fun visitClaude(claude : Claude)
}