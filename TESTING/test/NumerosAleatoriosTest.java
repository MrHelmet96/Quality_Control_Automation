import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class NumerosAleatoriosTest {
    @Test
    @ParameterizedTest
    @CsvSource({ "1, 10", "-10, 10", "5, 5", "200, 300", "10, 1" })
    void testNumeroAleatorioEnRango(int minimo, int maximo) {
        if (minimo > maximo) {
            Assertions.assertThrowsExactly(IllegalArgumentException.class,
                    () -> NumerosAleatorios.numeroAleatorioEnRango(minimo, maximo),
                    "El primer parametro debe ser menor al segundo");
        } else {
            int numeroAleatorio = NumerosAleatorios.numeroAleatorioEnRango(minimo, maximo);
            Assertions.assertTrue(numeroAleatorio >= minimo && numeroAleatorio <= maximo);
        }
    }
}
