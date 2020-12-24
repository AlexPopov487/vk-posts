package postComments

import attachments.AttachmentInterface
import postComponents.Comments

data class PostComment(
    val postId: Long,
    val id: Long,
    val fromId: Long,
    val date: Int,
    val text: String,
//    val donut: DonutForComment,
//    val replyToUser: Long?,
//    val replyToComment: Long?,
//    val attachments: Array<AttachmentInterface>,
//    val parentsStack: Array<Comments>,
//    val thread: Thread
    ){

}