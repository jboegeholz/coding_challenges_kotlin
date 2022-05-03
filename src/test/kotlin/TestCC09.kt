import kotlin.test.Test
import kotlin.test.assertEquals


internal class TestCC09 {

    @Test
    fun testFirstReverseOneChar() {
        val reversed: String = firstReverse("a")
        assertEquals("a", reversed)
    }
    @Test
    fun testFirstReverseTwoChars() {
        val reversed: String = firstReverse("ab")
        assertEquals("ba", reversed)
    }
}