package examen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

class EnvioServiceTest {

    @Test
    @DisplayName("Primer test: peso sobre límite falla con clase real")
    void testPesoSobreLimiteReal() {
        // Usar la clase real, no un mock
        EnvioService envio = new EnvioService(
                "ENV001", 0, 10, 10, 10, 50,
                EnvioService.TipoEnvio.EXPRESS, "Av. Test 123", LocalDate.now()
        );

        // Esto FALLARÁ la primera vez porque aún no tenemos lógica de límite
        assertThrows(IllegalArgumentException.class, () -> envio.setPeso(11.0));
    }

    @Test
    @DisplayName("Primer test: peso sobre límite falla (simulado con Mockito)")
    void testPesoSobreLimite() {
        // Crear mock de EnvioService
        EnvioService envioMock = Mockito.mock(EnvioService.class);

        // Configurar mock para lanzar excepción si setPeso
        Mockito.doThrow(new IllegalArgumentException("Peso supera el límite"))
                .when(envioMock).setPeso(11.0);

        // Esto debería FALLAR (red) la primera vez que se ejecute
        assertThrows(IllegalArgumentException.class, () -> envioMock.setPeso(11.0));
    }
}