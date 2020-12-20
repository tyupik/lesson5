data class AlbumAttachment(
    override val type: String,
    override val attach: Album,
) : Attachment
