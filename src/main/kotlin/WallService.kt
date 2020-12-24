import postComments.PostComment

class WallService {


    private var wallPosts = emptyArray<Post>()
    private var postCommentsArray = emptyArray<PostComment>()

    fun add(post: Post): Post {
        val idForAddedPost = if (wallPosts.isNotEmpty()) wallPosts.last().id + 1 else 1
        wallPosts += post
        post.id = idForAddedPost
        return wallPosts.last()
    }


    fun update(post: Post): Boolean {
        for ((index) in wallPosts.withIndex()) {
            if (post.id == wallPosts[index].id) {
                wallPosts[index] = post.copy(
                    id = post.id,
                    ownerId = post.ownerId,
                    createdBy = post.createdBy,
                    text = post.text,
                    likes = post.likes,
                    signerId = post.signerId
                )
                return true
            }
        }
        return false
    }

//    fun createComment(comment: PostComment): PostComment {
//        for (post in wallPosts) {
//            val idForPost = comment.postId
//            if (post.id == idForPost) {
//                postCommentsArray += comment
//                break
//            } else {
//                throw PostNotFoundException("no post found with the id $idForPost")
//            }
//        }
//
//        return postCommentsArray.last()
//    }
//}

    fun createCComment(comment: PostComment): PostComment {
        var isCommentAllowed = false

        for (post in wallPosts) {
            if (post.id == comment.postId) {
                isCommentAllowed = true
                break
            }
        }

        if (isCommentAllowed) postCommentsArray += comment else throw PostNotFoundException("no post found with the id ${comment.postId}")

        return postCommentsArray.last()

    }
}