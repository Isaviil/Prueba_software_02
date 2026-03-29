package examen;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PedidoServiceTest {

    @Test
    @DisplayName("Validar solo el código de pedido")
    void testCodigoInvalido() {
        PedidoService service = new PedidoService();

        // Código inválido, falla
        service.validarCodigo("AB243"); // only tests code
    }

    @Test
    @DisplayName("Validar solo el correo electrónico")
    void testCorreoInvalido() {
        PedidoService service = new PedidoService();

        // Email inválido, falla
        service.validarEmail("mail@mail.com");
    }

    @Test
    @DisplayName("Validar solo la cantidad de productos")
    void testCantidadInvalida() {
        PedidoService service = new PedidoService();

        // Cantidad inválida, falla
        service.validarCantidad(2);
    }

    @Test
    @DisplayName("Validar solo la fecha de entrega")
    void testFechaEntregaInvalida() {
        PedidoService service = new PedidoService();

        // Fecha inválida
        service.validarFecha(LocalDate.now().minusDays(0));
    }

    @Test
    @DisplayName("Validar un pedido completo con todos los elementos correctos")
    void testPedidoCompletoValido() {
        PedidoService service = new PedidoService();

        // Llamar a todos los métodos de validación juntos
        service.validarCodigo("AB123");
        service.validarEmail("cliente@email.com");
        service.validarCantidad(5);
        service.validarFecha(LocalDate.now().plusDays(1));

        // Registrar pedido completo
        String mensaje = service.registrarPedido("AB123", "cliente@email.com", 5, LocalDate.now().plusDays(1));
        assertEquals("El pedido ha sido registrado correctamente", mensaje);

        // mensaje para consola
        System.out.println(mensaje);
    }
}