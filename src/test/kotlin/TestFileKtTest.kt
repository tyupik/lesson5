import org.junit.Assert.*
import org.junit.Test

class TestFileKtTest {
    val testComment = Comments(5, true, true, true, true)
    val testCopyright = Copyright(5, "copy test link", "copy name", "copy type")
    val testLikes = Likes(5, true, true, true)
    val testRepost = Reposts(4, false)
    val testViews = Views(9)
    val testPlaceholder = Placeholder("test placeholder")
    val testDonut = Donut(false, 100, testPlaceholder, true, "all")
    val testPost = Post(
        1, 0, 1, 2,
        12122020, "test text", 4, 4,
        false, testComment, testCopyright, testLikes, testRepost, testViews,
        "post", 9, true, true, true, false, false,
        false, testDonut, 0
    )

    @Test
    fun isNewPostIdNull() {
        val result = addNewPost(testPost).id != 0
        assertTrue(result)
    }

    @Test
    fun isPostUpdatedFalse() {
        addNewPost(testPost)
        val result = updatePost(testPost.copy(id = 0))
        assertTrue(!result)

    }

    @Test
    fun isPostUpdatedTrue() {
        addNewPost(testPost)
        val result = updatePost(testPost.copy(id = 1))
        assertTrue(result)
    }
}