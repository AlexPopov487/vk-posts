class WallService {
    private var postId: Long = 1

    private var wallPosts = emptyArray<Post>()

    fun add(post: Post): Post {
        wallPosts += post
        post.id = postId
        postId++
        return wallPosts.last()
    }

    fun update(post: Post): Boolean{
        for ((index) in wallPosts.withIndex()) {
            if(post.id == wallPosts[index].id) {
                wallPosts[index] = post.copy(
                    id = post.id,
                    ownerId = post.ownerId,
                    createdBy = post.createdBy,
                    text = post.text)
                return true
            }
            }
        return false
    }
}