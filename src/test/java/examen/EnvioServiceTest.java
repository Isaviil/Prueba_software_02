package examen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertThrows;

class EnvioServiceTest {

    @Test
    @DisplayName("Falla si la dirección es inválida usando Mockito")
    void testDireccionInvalida() {
        // Crear un mock de EnvioService
        EnvioService envioMock = Mockito.mock(EnvioService.class);

        // Configurar el mock para que llame al método real cuando se valide la dirección
        Mockito.doCallRealMethod().when(envioMock).validarDireccion(Mockito.any());

        // Verificar que lanzar el método con null provoca excepción
        assertThrows(IllegalArgumentException.class, () -> {
            envioMock.validarDireccion(null);
        });
    }
}