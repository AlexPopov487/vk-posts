package attachments


data class Photo(
    val id: Int,
//    val albumId: Int,
//    val ownerId: Int,
//    val userId: Int,
//    val text: String,
//    val date: Int,
    val width: Int,
    val height: Int,
    val sizes: Array<String> =  Array(4){"photo, www.gggg.com, $width, $height"}
) {
}