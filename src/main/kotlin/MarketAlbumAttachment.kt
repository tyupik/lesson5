data class MarketAlbumAttachment(
    override val type: String = "MarketAlbum",
    val marketAlbum: MarketAlbum,
) : Attachment
