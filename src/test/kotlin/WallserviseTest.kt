import org.junit.Assert.*
import org.junit.Test

class WallserviseTest {
    @Test
    fun add() {
        val post = Post(id = 0)
        val expected = 4
        Wallservise.add(post)
        val result = Wallservise.add(post).id

        assertEquals(expected, result)
    }

    @Test
    fun update_true() {
        val post1 = Post(id = 11)
        val post2 = Post(id = 1, text = "newText")
        Wallservise.add(post1)

        val result = Wallservise.update(post2)

        assertTrue(result)
    }

    @Test
    fun update_false() {
        val post1 = Post(id = 11)
        val post2 = Post(id = 2, text = "newText")
        Wallservise.add(post1)

        val result = Wallservise.update(post2)

        assertFalse(result)
    }
}