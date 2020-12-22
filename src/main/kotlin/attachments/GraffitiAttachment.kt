package attachments

class GraffitiAttachment(
    override val type: String = "graffiti",
    val graffiti: Graffiti = Graffiti(id = 3, ownerId= 2, photo130 = "link", photo604 = "link"))
    : AttachmentInterface {

    override fun toString(): String {
        return "type: $type, $graffiti"

    }
}