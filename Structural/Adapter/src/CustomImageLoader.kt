class CustomImageLoader : ImageLoader {
    private val adapter = ImageLoaderAdapter()

    override fun loadImage(imageType: String, imageUrl: String, container: ImageContainer) {
        if (imageType.lowercase() == "gif") {
            container.setImage(imageUrl)
            println("Loaded an image with URL: $imageUrl")
        }
        else if (imageType.lowercase() == "png" || imageType.lowercase() == "jpeg") {
            adapter.loadImage(imageType, imageUrl, container)
        }
        else {
            println("Image type is invalid")
        }
    }
}