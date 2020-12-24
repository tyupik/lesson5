data class PhotoAttachment(
    override val type: String = "Photo",
    val photo: Photo,
) : Attachment

