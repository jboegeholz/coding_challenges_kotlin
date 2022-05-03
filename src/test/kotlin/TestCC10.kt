import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Template for Unit Tests
 */
internal class TestCC10 {

    @Test
    fun testCompareNum1Smaller() {
        val compared = compare(0,1)
        assertEquals(-1, compared)
    }

    @Test
    fun testCompareNum1Bigger() {
        val compared = compare(2,1)
        assertEquals(1, compared)
    }

    @Test
    fun testCompareNum1EqualsNum2() {
        val compared = compare(2,2)
        assertEquals(0, compared)
    }
}