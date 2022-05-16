import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Template for Unit Tests
 */
internal class TestCC13 {

    @Test
    fun testConvertTimeZeroMinutes() {
        val result = convertTime(0)
        assertEquals("0:00", result)
    }
    @Test
    fun testConvertTimeOneMinute() {
        val result = convertTime(1)
        assertEquals("0:01", result)
    }
    @Test
    fun testConvertTimeFiftynineMinutes() {
        val result = convertTime(59)
        assertEquals("0:59", result)
    }
    @Test
    fun testConvertTimeSixtyMinutes() {
        val result = convertTime(60)
        assertEquals("1:00", result)
    }
    @Test
    fun testConvertTimeSixtyOneMinutes() {
        val result = convertTime(61)
        assertEquals("1:01", result)
    }
    @Test
    fun testConvertTime99Minutes() {
        val result = convertTime(99)
        assertEquals("1:39", result)
    }
}