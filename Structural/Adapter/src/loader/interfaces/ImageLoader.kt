package loader.interfaces

import containers.ImageContainer

interface ImageLoader {
    fun loadImage(imageType: String, imageUrl : String, container : ImageContainer)
}