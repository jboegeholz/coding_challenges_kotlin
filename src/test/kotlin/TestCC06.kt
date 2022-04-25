import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue


internal class TestCC06 {

    @Test
    fun testPasswordLength() {
        val myPassword: String = generatePassword()
        assertEquals(8, myPassword.length)
    }
    @Test
    fun testPasswordHasDigit() {
        val myPassword: String = generatePassword()
        var hasDigit = false
        println(myPassword)
        for (c in myPassword){
            if(c.isDigit()){
                hasDigit = true
            }
        }
        assertTrue(hasDigit)
    }
    @Test
    fun testPasswordHasLower() {
        val myPassword: String = generatePassword()
        var hasLower = false
        println(myPassword)
        for (c in myPassword){
            if(c.isLowerCase()){
                hasLower = true
            }
        }
        assertTrue(hasLower)
    }
    @Test
    fun testPasswordHasUpper() {
        val myPassword: String = generatePassword()
        var hasUpper = false
        println(myPassword)
        for (c in myPassword){
            if(c.isUpperCase()){
                hasUpper = true
            }
        }
        assertTrue(hasUpper)
    }
    @Test
    fun testPasswordHasSpecial() {
        val specialChar = listOf('!', '”', '§', '$', '%', '&', '/', '?')
        val myPassword: String = generatePassword()
        var hasSpecial = false
        println(myPassword)
        for (c in myPassword){
            if(specialChar.contains(c)){
                hasSpecial = true
            }
        }
        assertTrue(hasSpecial)
    }
}