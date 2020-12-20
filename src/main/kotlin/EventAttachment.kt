data class EventAttachment(
    override val type: String,
    override val attach: Event,
) : Attachment
