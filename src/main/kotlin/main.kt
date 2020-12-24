import attachments.*
import postComments.PostComment
import postComponents.Likes
import java.util.*

fun main() {


    val service = WallService()

    val post = Post(
        ownerId = 2,
        fromId = 3,
        createdBy = 4,
        date = 17,
        text = "First post",
        likes = Likes(count = 3, userLikes = true, canLike = true, canPublish = true),
        attachments = arrayOf<AttachmentInterface>(AudioAttachment(), AppAttachment()),
        signerId = 0
    )


    val secondPost = Post(
        ownerId = 3,
        fromId = 5,
        createdBy = 4,
        date = 27,
        text = "Second post",
        likes = Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
        attachments = arrayOf<AttachmentInterface>(NoteAttachment()),
        signerId = 0
    )
    val thirdPost = Post(
        ownerId = 5,
        fromId = 7,
        createdBy = 3,
        date = 7,
        text = "Third post",
        likes = Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
        attachments = arrayOf<AttachmentInterface>(PhotoAttachment(), AudioAttachment()),
        signerId = 0
    )

    println(service.add(post))
    println(service.add(secondPost))
    println(service.add(thirdPost))

    print(service.createComment(PostComment(postId = 3, id= 23, fromId= 34, date= 24, text= "Hey there!")))




}