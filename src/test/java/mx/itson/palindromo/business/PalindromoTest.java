package mx.itson.palindromo.business;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromoTest {

    @Test
    public void testValidPalindromes() { //En este bloque se valida que todo sea true
        assertTrue(Palindromo.isPalindromo("madam"));
        assertTrue(Palindromo.isPalindromo("12321"));
    }

    @Test
    public void testInvalidPalindrome() { //Se valida que todo sea false
        assertFalse(Palindromo.isPalindromo("Hola Bruno"));
    }

    @Test
    public void testEmptyString() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            Palindromo.isPalindromo("");
        });
        assertEquals("No escribiste ningun Palindromo", thrown.getMessage());
    }
}
