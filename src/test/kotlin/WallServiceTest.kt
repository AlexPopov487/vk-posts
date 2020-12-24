import attachments.*
import org.junit.Test

import org.junit.Assert.*
import postComments.PostComment
import postComponents.Likes

class WallServiceTest {
    private val service = WallService()

    @Test
    fun updatePost_True() {


        service.add(Post(
            ownerId = 2,
            fromId = 3,
            createdBy = 4,
            date = 17,
            text = "First post",
            likes = Likes(count = 3, userLikes = true, canLike = true, canPublish = true),
            attachments = arrayOf<AttachmentInterface>(AudioAttachment(), AppAttachment()),
            signerId = 0))

        service.add(Post(
            ownerId = 3,
            fromId = 5,
            createdBy = 4,
            date = 27,
            text = "Second post",
            likes = Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
            attachments = arrayOf<AttachmentInterface>(NoteAttachment()),
            signerId = 0))

        service.add(Post(
            ownerId = 5,
            fromId = 7,
            createdBy = 3,
            date = 7,
            text = "Third post",
            likes = Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
            attachments = arrayOf<AttachmentInterface>(PhotoAttachment(), AudioAttachment()),
            signerId = 0))

        val update = Post(
            1,
            6,
            3,
            4,
            25,
            "Update post",
            likes= Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
            attachments = arrayOf<AttachmentInterface>(NoteAttachment(), AppAttachment()),
            0
        )

        val result = service.update(update)

        assertTrue(result)

    }

    @Test
    fun updatePost_False() {


        service.add(Post(
            ownerId = 2,
            fromId = 3,
            createdBy = 4,
            date = 17,
            text = "First post",
            likes = Likes(count = 3, userLikes = true, canLike = true, canPublish = true),
            attachments = arrayOf<AttachmentInterface>(AudioAttachment(), AppAttachment()),
            signerId = 0))

        service.add(Post(
            ownerId = 3,
            fromId = 5,
            createdBy = 4,
            date = 27,
            text = "Second post",
            likes = Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
            attachments = arrayOf<AttachmentInterface>(NoteAttachment()),
            signerId = 0))

        service.add(Post(
            ownerId = 5,
            fromId = 7,
            createdBy = 3,
            date = 7,
            text = "Third post",
            likes = Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
            attachments = arrayOf<AttachmentInterface>(PhotoAttachment(), AudioAttachment()),
            signerId = 0))

        val update = Post(
            4,
            6,
            3,
            4,
            25,
            "Update post",
            likes= Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
            attachments = arrayOf<AttachmentInterface>(NoteAttachment(), AppAttachment()),
            0
        )

        val result = service.update(update)

        assertFalse(result)

    }

    @Test
    fun addPost(){
        val post = Post(
            ownerId = 2,
            fromId = 3,
            createdBy = 4,
            date = 17,
            text = "First post",
            likes = Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
            attachments = arrayOf<AttachmentInterface>(NoteAttachment(), AudioAttachment()),
            signerId = 0
        )
        service.add(post)
        val expected = (post.id > 0)
        assertTrue(expected)
    }

    @Test
    fun createComment_compilesWell(){
        val post = Post(
            ownerId = 2,
            fromId = 3,
            createdBy = 4,
            date = 17,
            text = "First post",
            likes = Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
            attachments = arrayOf<AttachmentInterface>(NoteAttachment(), AudioAttachment()),
            signerId = 0
        )
        service.add(post)

        val commentToAdd = PostComment(postId = 1, id= 23, fromId= 34, date= 24, text= "Hey there!")
        service.createComment(commentToAdd)

        val expected = commentToAdd.postId == post.id
        assertTrue(expected)
    }
    @Test(expected= PostNotFoundException::class)
    fun createComment_throwsException(){
        val post = Post(
            ownerId = 1,
            fromId = 3,
            createdBy = 4,
            date = 17,
            text = "First post",
            likes = Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
            attachments = arrayOf<AttachmentInterface>(NoteAttachment(), AudioAttachment()),
            signerId = 0
        )
        service.add(post)

        val commentToAdd = PostComment(postId = 2, id= 23, fromId= 34, date= 24, text= "Hey there!")
        service.createComment(commentToAdd)

    }
}