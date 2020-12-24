import java.util.*

data class Photo (
    val id: Int = 1,
    val albumId: Int = 1,
    val ownerId: Int = 1,
    val userId: Int = 1,
    val text: String = "text",
    val date: Int = 1,
    val sizes: Int = 1,
    val width: Int = 1,
    val height: Int = 1
)
