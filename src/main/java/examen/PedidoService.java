package examen;

import java.time.LocalDate;

public class PedidoService {

    public String registrarPedido(String codigo, String email, int cantidad, LocalDate fechaEntrega) {

        // Validar código de pedido
        if (codigo == null || !codigo.matches("[A-Z]{2}\\d{3}")) {
            return "Ingrese un código de pedido válido";
        }

        // Por ahora, ignoramos email, cantidad y fecha
        return "El pedido ha sido registrado correctamente";
    }
}