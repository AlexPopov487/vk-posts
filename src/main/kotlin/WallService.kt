class WallService {


    private var wallPosts = emptyArray<Post>()

    fun add(post: Post): Post {
        val idForAddedPost = if (wallPosts.isNotEmpty()) wallPosts.last().id + 1 else  1
        wallPosts += post
        post.id =idForAddedPost
        return wallPosts.last()
    }

    fun update(post: Post): Boolean{
        for ((index) in wallPosts.withIndex()) {
            if(post.id == wallPosts[index].id) {
                wallPosts[index] = post.copy(
                    id = post.id,
                    ownerId = post.ownerId,
                    createdBy = post.createdBy,
                    text = post.text,
                    likes = post.likes,
                    signerId = post.signerId)
                return true
            }
            }
        return false
    }
}