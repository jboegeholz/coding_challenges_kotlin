import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

/**
 * Template for Unit Tests
 */
internal class TestCC12 {

    @Test
    fun testSimpleAddZero() {
        val result = simpleAdd(0)
        assertEquals(0, result)
    }
    @Test
    fun testSimpleAddOne() {
        val result = simpleAdd(1)
        assertEquals(1, result)
    }
    @Test
    fun testSimpleAddTwo() {
        val result = simpleAdd(2)
        assertEquals(3, result)
    }
    @Test
    fun testSimpleAddThree() {
        val result = simpleAdd(3)
        assertEquals(6, result)
    }
    @Test
    fun testSimpleAddFour() {
        val result = simpleAdd(4)
        assertEquals(10, result)
    }
}