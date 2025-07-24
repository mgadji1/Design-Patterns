import llms.implementations.ChatGPT
import llms.implementations.Claude
import llms.implementations.DeepSeek
import visitors.implementations.ImageAnalyzer
import visitors.implementations.TextAnalyzer

fun main() {
    val chatGPT = ChatGPT()
    val deepSeek = DeepSeek()
    val claude = Claude()

    val textAnalyzer = TextAnalyzer()

    chatGPT.accept(textAnalyzer)
    deepSeek.accept(textAnalyzer)
    claude.accept(textAnalyzer)

    val imageAnalyzer = ImageAnalyzer()

    chatGPT.accept(imageAnalyzer)
    deepSeek.accept(imageAnalyzer)
    claude.accept(imageAnalyzer)
}