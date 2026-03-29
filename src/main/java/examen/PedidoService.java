package examen;

import java.time.LocalDate;

public class PedidoService {

    public String registrarPedido(String codigo, String email, int cantidad, LocalDate fechaEntrega) {

        // Validar código de pedido
        if (codigo == null || !codigo.matches("[A-Z]{2}\\d{3}")) {
            return "Ingrese un código de pedido válido";
        }

        // Validar correo electrónico
        if (email == null || email.length() < 6 || !email.contains("@")) {
            return "Ingrese un correo electrónico válido";
        }

        // Validar cantidad de productos
        if (cantidad <= 0) {
            return "La cantidad debe ser mayor a cero";
        }

        return "El pedido ha sido registrado correctamente";
    }
}