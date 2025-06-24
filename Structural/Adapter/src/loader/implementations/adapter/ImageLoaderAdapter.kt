package loader.implementations.adapter

import advancedLoader.implementations.JpegLoader
import advancedLoader.implementations.PngLoader
import containers.ImageContainer
import loader.interfaces.ImageLoader

class ImageLoaderAdapter : ImageLoader {
    private val pngLoader = PngLoader()
    private val jpegLoader = JpegLoader()

    override fun loadImage(imageType: String, imageUrl: String, container: ImageContainer) {
        if (imageType.lowercase() == "png") {
            pngLoader.loadPng(imageUrl, container)
        }
        else if (imageType.lowercase() == "jpeg") {
            jpegLoader.loadJpeg(imageUrl, container)
        }
    }
}