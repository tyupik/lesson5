data class Comment(
    val id: Int = 1,
    val fromId: Int = 2,
    val date: Int = 1,
    val text: String = "text",
    val donut: Donut? = null,
    val replyToUser: Int = 3,
    val replyToComment: Int = 3,
    val attachment: Attachment? = null,
    val parentsStack: Int = 1,
    val thread: Thread? = null,
    val postId: Int = 1
)
