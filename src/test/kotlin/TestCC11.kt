import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Template for Unit Tests
 */
internal class TestCC11 {

    @Test
    fun testAlphabetSoupOneChar() {
        val ret = alphabetSoup("a")
        assertEquals("a", ret)
    }
    @Test
    fun testAlphabetSoupTwoChar() {
        val ret = alphabetSoup("ba")
        assertEquals("ab", ret)
    }
    @Test
    fun testAlphabetSoupTstData() {
        val ret = alphabetSoup("helloworld")
        assertEquals("dehllloorw", ret)
    }
}