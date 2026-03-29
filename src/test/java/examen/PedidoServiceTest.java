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

    @Test
    @DisplayName("Debe fallar si el correo electrónico es inválido")
    void testCorreoInvalido() {
        PedidoService service = new PedidoService();

        // Correo inválido: menos de 6 caracteres o sin "@"
        String mensaje = service.registrarPedido("AB123", "mail", 1, LocalDate.now().plusDays(1));

        assertEquals("Ingrese un correo electrónico válido", mensaje);
    }

    @Test
    @DisplayName("Debe fallar si la cantidad de productos es menor o igual a cero")
    void testCantidadInvalida() {
        PedidoService service = new PedidoService();

        // Cantidad inválida: 0
        String mensaje = service.registrarPedido("AB123", "cliente@email.com", 0, LocalDate.now().plusDays(1));

        assertEquals("La cantidad debe ser mayor a cero", mensaje);
    }

    @Test
    @DisplayName("Debe fallar si la fecha de entrega es anterior a la fecha actual")
    void testFechaEntregaInvalida() {
        PedidoService service = new PedidoService();

        // Fecha inválida: ayer
        String mensaje = service.registrarPedido("AB123", "cliente@email.com", 1, LocalDate.now().minusDays(1));

        assertEquals("Ingrese una fecha de entrega válida", mensaje);
    }
}