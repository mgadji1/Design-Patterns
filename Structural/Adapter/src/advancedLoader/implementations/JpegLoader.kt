package advancedLoader.implementations

import containers.ImageContainer
import advancedLoader.interfaces.AdvancedImageLoader

class JpegLoader : AdvancedImageLoader {
    override fun loadJpeg(imageUrl: String, container: ImageContainer) {
        container.setImage(imageUrl)
        println("Loaded an image with URL: $imageUrl")
    }

    override fun loadPng(imageUrl: String, container: ImageContainer) {
        println("Cannot load an image with PNG format")
    }
}