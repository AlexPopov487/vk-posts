package attachments

data class Attachments(override val type:String, override val obj: Any = when(type) {
    "audio" -> Audio(ownerId = 1,artist = "Fedor", title = "Song 2")
    "photo" -> Photo(id = 1, width = 50, height = 50)
    "graffiti" -> Graffiti(id = 1, ownerId = 4, photo130 = "link", photo604 = "linklink")
    "app" -> App(id = 3, name = "Super app", photo130 = "link", photo604 = "linklink")
    "note" -> Note(id = 55, ownerId = 33, title = "note")
    else -> "Attachment cannot be added!"
}): AttachmentInterface {

}
