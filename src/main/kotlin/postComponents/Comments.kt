package postComponents

data class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPos: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean) {
}