package attachments

class PhotoAttachment(
    override val type: String = "photo",
    val photo: Photo = Photo(id = 2, width = 33, height = 33))
    : AttachmentInterface {
    override fun toString(): String {
        return "type: $type, $photo"
    }
}