package examen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoServiceTest {

    @Test
    @DisplayName("Debe fallar si el código de pedido no tiene formato válido")
    void testCodigoPedidoInvalido() {
        PedidoService service = new PedidoService();

        // Código inválido: menos de 5 caracteres
        String mensaje = service.registrarPedido("A12", "cliente@email.com", 1, LocalDate.now().plusDays(1));

        assertEquals("Ingrese un código de pedido válido", mensaje);
    }
}