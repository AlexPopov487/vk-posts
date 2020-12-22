package attachments

class AppAttachment(
    override val type: String = "app",
    val app: App = App(id = 1, name = "app", photo130 = "link", photo604 = "link"))
    : AttachmentInterface {
    override fun toString(): String {
        return "type: $type, $app"
    }
}