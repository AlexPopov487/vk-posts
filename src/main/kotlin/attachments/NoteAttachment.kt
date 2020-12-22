package attachments

class NoteAttachment(
    override val type: String = "note",
    val note: Note = Note(id = 1, ownerId= 3, title= "Note"))
    : AttachmentInterface {
    override fun toString(): String {
        return "type: $type, $note"
    }
}