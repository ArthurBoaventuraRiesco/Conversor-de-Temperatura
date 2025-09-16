// Arquivo: CalculadoraTest.java (src/test/java)
import org.example.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private static final double EPS = 1e-6;

//casos normais

    @Test
    void testCelsius0ToFahrenheit32() {
        assertEquals(32.0, Calculadora.celsiusToFahrenheit(0.0), EPS);
    }

    @Test
    void testCelsius100ToFahrenheit212() {
        assertEquals(212.0, Calculadora.celsiusToFahrenheit(100.0), EPS);
    }

    @Test
    void testFahrenheit32ToCelsius0() {
        assertEquals(0.0, Calculadora.fahrenheitToCelsius(32.0), EPS);
    }

    @Test
    void testFahrenheit212ToCelsius100() {
        assertEquals(100.0, Calculadora.fahrenheitToCelsius(212.0), EPS);
    }

//casos de borda

    @Test
    void testAbsoluteZeroCtoF() {
        assertEquals(-459.67, Calculadora.celsiusToFahrenheit(-273.15), 1e-2);
    }

    @Test
    void testAbsoluteZeroFtoC() {
        assertEquals(-273.15, Calculadora.fahrenheitToCelsius(-459.67), 1e-2);
    }
}


