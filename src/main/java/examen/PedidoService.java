package examen;

import java.time.LocalDate;

public class PedidoService {

    public String registrarPedido(String codigo, String email, int cantidad, LocalDate fechaEntrega) {
        // Call all validations
        validarCodigo(codigo);
        validarEmail(email);
        validarCantidad(cantidad);
        validarFecha(fechaEntrega);

        return "El pedido ha sido registrado correctamente";
    }

    // =========================
    // Validaciones separadas
    // =========================
    public void validarCodigo(String codigo) {
        if (codigo == null || !codigo.matches("[A-Z]{2}\\d{3}")) {
            throw new IllegalArgumentException("Ingrese un código de pedido válido");
        }
    }

    public void validarEmail(String email) {
        if (email == null || email.length() < 6 || !email.contains("@")) {
            throw new IllegalArgumentException("Ingrese un correo electrónico válido");
        }
    }

    public void validarCantidad(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero");
        }
    }

    public void validarFecha(LocalDate fechaEntrega) {
        if (fechaEntrega != null && fechaEntrega.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de entrega debe ser mayor o igual a la fecha actual");
        }
    }
}