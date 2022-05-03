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
    @Test
    fun testFirstReverseThreeChars() {
        val reversed: String = firstReverse("abc")
        assertEquals("cba", reversed)
    }
    @Test
    fun testFirstReverseForChars() {
        val reversed: String = firstReverse("abcd")
        assertEquals("dcba", reversed)
    }
    @Test
    fun testFirstReverseTestInput() {
        val reversed: String = firstReverse("Hello World and Coders")
        assertEquals("sredoC dna dlroW olleH", reversed)
    }
}