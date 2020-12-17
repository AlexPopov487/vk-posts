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
//    val comments: Any,
//    val copyright: Any,
//    val likes: Any,
//    val reposts: Any,
//    val views: Any,
//    val postType: String,
//    val signerId: Int,
//    val canPin: Boolean,
//    val canDelete: Boolean,
//    val canEdit: Boolean,
//    val isPinned: Boolean,
//    val markedAsAds: Boolean,
//    val isFavorite: Boolean,
//    val donut: Any,
//    val postponedId: Int
    ) {
}