import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    private val service = WallService()

    @Test
    fun updatePost_True() {


        service.add(Post(ownerId = 2, fromId = 3,createdBy = 4, date = 17, text = "First post"))
        service.add(Post(ownerId = 3, fromId = 5,createdBy = 4, date = 27, text ="Second post"))
        service.add(Post(ownerId = 5, fromId = 7,createdBy = 3, date = 7, text ="Third post"))

        val update = Post(1, 6, 3,4,25, "Update post")

        val result = service.update(update)

        assertTrue(result)

    }

    @Test
    fun updatePost_False() {


        service.add(Post(ownerId = 2, fromId = 3,createdBy = 4, date = 17, text = "First post"))
        service.add(Post(ownerId = 3, fromId = 5,createdBy = 4, date = 27, text ="Second post"))
        service.add(Post(ownerId = 5, fromId = 7,createdBy = 3, date = 7, text ="Third post"))

        val update = Post(4, 6, 3,4,25, "Update post")

        val result = service.update(update)

        assertFalse(result)

    }

    @Test
    fun addPost(){
        val post = Post(ownerId = 2, fromId = 3,createdBy = 4, date = 17, text = "First post")
        service.add(post)
        val expected = (post.id > 0)
        assertTrue(expected)
    }
}