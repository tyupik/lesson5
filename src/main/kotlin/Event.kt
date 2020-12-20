data class Event(
    val id: Int = 1,
    val time: Int = 1,
    val memberStatus: Int = 1,
    val isFavorite: Boolean = true,
    val address: String = "address",
    val text: String = "text",
    val buttonText: String = "button",
    val friends: Int = 1
)