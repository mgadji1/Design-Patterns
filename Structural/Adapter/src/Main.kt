fun main() {
    val customImageLoader = CustomImageLoader()

    val pngImageUrl = "https://images.com/image.png"
    val jpegImageUrl = "https://images.com/image.jpeg"
    val gifImageUrl = "https://images.com/image.gif"
    val invalidImageUrl = "invalid"

    val imageContainer = ImageContainer()

    customImageLoader.loadImage("png", pngImageUrl, imageContainer)
    customImageLoader.loadImage("jpeg", jpegImageUrl, imageContainer)
    customImageLoader.loadImage("gif", gifImageUrl, imageContainer)
    customImageLoader.loadImage("invalid", invalidImageUrl, imageContainer)
}