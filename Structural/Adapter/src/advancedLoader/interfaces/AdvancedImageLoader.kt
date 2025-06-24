package advancedLoader.interfaces

import containers.ImageContainer

interface AdvancedImageLoader {
    fun loadPng(imageUrl : String, container : ImageContainer)
    fun loadJpeg(imageUrl : String, container: ImageContainer)
}