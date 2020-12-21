data class AlbumAttachment(
    override val type: String = "Album",
    val album: Album,
) : Attachment
