import org.junit.jupiter.api.*

class MainTest {

    @Test
    @DisplayName("Teste metodo xxoo")
    fun testCountXO() {
        Assertions.assertAll(
            {Assertions.assertTrue(countXO("xxoo"))},
            {Assertions.assertFalse(countXO("xxxoo"))}
        )

    }

    @Test
    @Disabled
    fun notImplemented() {

    }

    @Test
    fun vaiFalhar() {
        fail("Não posso terminar os testes sem esse método")
    }

    @Test
    fun assumption() {
        Assumptions.assumeTrue(countXO("xxxoo"))
        
        Assertions.assertTrue(abc())
    }

    @Test
    fun exception() {
        assertThrows<NullPointerException> { abc() }
    }

}