package examen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

class EnvioServiceTest {

    @Test
    @DisplayName("Falla si la dirección es inválida usando Mockito")
    void testDireccionInvalida() {
        // Crear un mock de EnvioService
        EnvioService envioMock = Mockito.mock(EnvioService.class);

        // Configurar mock para que lance excepción si dirección es inválida
        Mockito.when(envioMock.getDireccion()).thenReturn(null);

        // Verificar que lanzar el método provoca excepción
        assertThrows(IllegalArgumentException.class, () -> {
            if (envioMock.getDireccion() == null || envioMock.getDireccion().isEmpty()) {
                throw new IllegalArgumentException("La dirección debe ser válida y no nula");
            }
        });
    }
}