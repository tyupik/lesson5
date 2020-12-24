data class EventAttachment(
    override val type: String = "Event",
    val event: Event,
) : Attachment
