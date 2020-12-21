import attachments.AttachmentInterface
import attachments.Attachments
import postComponents.*

data class Post(
    var id: Long = 0, // выставляется автоматически в WallService.add()
    val ownerId: Int,
    val fromId: Int = 1,
    val createdBy: Int,
    val date: Int,
    val text: String,
//    val replyOwnerId: Int,
//    val replyPostId: Int,
//    val friendsOnly: Boolean,
//    val comments: Comments,
//    val copyright: Copyright,
    val likes: Likes,
//    val reposts: Reposts,
//    val views: Views,
//    val postType: String,
//    val postSource: PostSource,
    val attachments: Array<AttachmentInterface>,
//    val geo: Geo,
    val signerId: Int?,
//    val copyHistory: Array<Reposts?>,
//    val canPin: Boolean,
//    val canDelete: Boolean,
//    val canEdit: Boolean,
//    val isPinned: Boolean,
//    val markedAsAds: Boolean,
//    val isFavorite: Boolean,
//    val donut: Donut,
//    val postponedId: Int?
    ) {
}