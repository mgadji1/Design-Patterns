package advancedLoader.implementations

import containers.ImageContainer
import advancedLoader.interfaces.AdvancedImageLoader

class PngLoader : AdvancedImageLoader {
    override fun loadPng(imageUrl: String, container: ImageContainer) {
        container.setImage(imageUrl)
        println("Loaded an image with URL: $imageUrl")
    }

    override fun loadJpeg(imageUrl: String, container: ImageContainer) {
        println("Cannot load an image with JPEG format")
    }
}