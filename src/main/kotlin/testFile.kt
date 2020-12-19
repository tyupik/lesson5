val wallService = WallService()
fun main() {
    val testComment = Comments(5, true, true, true, true)
    val testCopyright = Copyright(5, "copy test link", "copy name", "copy type")
    val testLikes = Likes(5, true, true, true)
    val testRepost = Reposts(4, false)
    val testViews = Views(9)
    val testPlaceholder = Placeholder("test placeholder")
    val testDonut = Donut(false, 100, testPlaceholder, true, "all")
    val testPost = Post(
        0, 0, 1, 2,
        12122020, "test text", 4, 4,
        false, testComment, testCopyright, testLikes, testRepost, testViews,
        "post", 9, true, true, true, false, false,
        false, testDonut, 0
    )
    println(addNewPost(testPost).id)
    println(updatePost(testPost.copy(id = 1)))
}

fun addNewPost(post: Post): Post {
    return wallService.add(post)
}

fun updatePost(post: Post): Boolean {
    return wallService.update(post)
}