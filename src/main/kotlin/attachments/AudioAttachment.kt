package attachments

class AudioAttachment(
    override val type: String = "audio",
    val audio: Audio = Audio(ownerId = 1, "Stepan", "Kotlin"))
    : AttachmentInterface{
    override fun toString(): String {
        return "type: $type, $audio"
    }
}