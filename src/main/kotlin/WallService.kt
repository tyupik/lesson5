object WallService {
    var posts = emptyArray<Post>()

    fun add(newPost: Post): Post {
        val nextId: Int = if (posts.isEmpty()) 1 else posts[posts.size - 1].id + 1
        val copy = newPost.copy(id = nextId)
        posts += copy
        return copy
    }

    fun update(postUpdate: Post): Boolean {
        posts.forEachIndexed { index, post ->
            if (post.id == postUpdate.id) {
                val target = posts[index]
                val copy = postUpdate.copy(ownerId = target.ownerId, date = target.date)
                posts[index] = copy
                return true
            }
        }
        return false
    }
}