package examen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoServiceTest {

    @Test
    @DisplayName("Debe aceptar un código de pedido con formato válido")
    void testCodigoPedidoValido() {
        PedidoService service = new PedidoService();

        // Código válido
        String mensaje = service.registrarPedido("AB123", "cliente@email.com", 1, LocalDate.now().plusDays(1));

        assertEquals("El pedido ha sido registrado correctamente", mensaje);
    }

}