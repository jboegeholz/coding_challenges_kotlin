import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import kotlin.math.sqrt
import kotlin.math.floor

internal class TestCC08 {

    @Test
    fun testPrimeSieve() {
        val listOfPrimes = getListOfPrimes(10)
        assertEquals(listOf(1, 3), listOfPrimes)
    }



}
private fun getListOfPrimes(n: Int): Any {


    // Initialisierung des Primzahlfeldes
    // Alle Zahlen im Feld sind zu Beginn nicht gestrichen
    val gestrichen: MutableList<Boolean> = MutableList(n) { false }


    // Siebe mit allen (Prim-) Zahlen i, wobei i der kleinste Primfaktor einer zusammengesetzten
    // Zahl j = i*k ist. Der kleinste Primfaktor einer zusammengesetzten Zahl j kann nicht größer
    // als die Quadratwurzel von j <= n sein.
    val sqrtOfN = floor(sqrt(n.toDouble())).toInt()
//    for (i in 2..sqrtOfN) {
//        if(!gestrichen[i]) {
//            // i ist prim, gib i aus...
//            println(i)
//            // ...und streiche seine Vielfachen, beginnend mit i*i
//            // (denn k*i mit k<i wurde schon als Vielfaches von k gestrichen)
//            for j = i*i to N step i do
//                gestrichen[j] = true
//            end
//            end if
//                end
//        }
//    }
//
//
//    // Gib die Primzahlen größer als Wurzel(n) aus - also die, die noch nicht gestrichen wurden
//    for i = sqrt(N)+1 to N do
//        if not gestrichen[i] then
//                // i ist prim, gib i aus
//                print i; ", ";
//    end if
//        end
    return listOf(1)
}