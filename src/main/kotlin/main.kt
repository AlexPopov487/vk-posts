import attachments.AttachmentInterface
import attachments.Attachments
import postComponents.Likes

fun main() {


    val service = WallService()

    val post = Post(
        ownerId = 2,
        fromId = 3,
        createdBy = 4,
        date = 17,
        text = "First post",
        likes = Likes(count = 3, userLikes = true, canLike = true, canPublish = true),
        attachments = arrayOf<AttachmentInterface>(Attachments(type = "note"), Attachments(type="audio")),
        signerId = 0
    )




    val secondPost = Post(
        ownerId = 3,
        fromId = 5,
        createdBy = 4,
        date = 27,
        text = "Second post",
        likes = Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
        attachments = arrayOf<AttachmentInterface>(Attachments(type = "graffiti"), Attachments(type="photo")),
        signerId = 0
    )
    val thirdPost = Post(
        ownerId = 5,
        fromId = 7,
        createdBy = 3,
        date = 7,
        text = "Third post",
        likes = Likes(count = 5, userLikes = true, canLike = true, canPublish = true),
        attachments = arrayOf<AttachmentInterface>(Attachments(type = "app")),
        signerId = 0
    )

    println(service.add(post))
    println(service.add(secondPost))
    println(service.update(secondPost))
    println(service.update(thirdPost))

    println(post)
}