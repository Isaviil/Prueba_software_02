package examen;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EnvioService {

    private String codigoEnvio;
    private double peso;
    private double largo;
    private double ancho;
    private double alto;
    private double distanciaKm;
    private TipoEnvio tipoEnvio;
    private String direccion;
    private LocalDate fechaEntregaEstimad;
    private double tarifa;

    private static final double PESO_LIMITE = 10.0;
    private static final double RECARGO_PESO = 50.0;
    private static final List<String> ZONAS_RESTRINGIDAS = Arrays.asList("Zona1", "Zona2");


    public EnvioService(String codigoEnvio, double peso, double largo, double ancho, double alto,
                        double distanciaKm, TipoEnvio tipoEnvio, String direccion, LocalDate fechaEntregaEstimad) {
        this.codigoEnvio = codigoEnvio;
        this.peso = peso;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.distanciaKm = distanciaKm;
        this.tipoEnvio = tipoEnvio;
        this.direccion = direccion;
        this.fechaEntregaEstimad = fechaEntregaEstimad;
    }


    public String getCodigoEnvio() { return codigoEnvio; }
    public void setCodigoEnvio(String codigoEnvio) { this.codigoEnvio = codigoEnvio; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public double getLargo() { return largo; }
    public void setLargo(double largo) { this.largo = largo; }

    public double getAncho() { return ancho; }
    public void setAncho(double ancho) { this.ancho = ancho; }

    public double getAlto() { return alto; }
    public void setAlto(double alto) { this.alto = alto; }

    public double getDistanciaKm() { return distanciaKm; }
    public void setDistanciaKm(double distanciaKm) { this.distanciaKm = distanciaKm; }

    public TipoEnvio getTipoEnvio() { return tipoEnvio; }
    public void setTipoEnvio(TipoEnvio tipoEnvio) { this.tipoEnvio = tipoEnvio; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public LocalDate getFechaEntregaEstimad() { return fechaEntregaEstimad; }
    public void setFechaEntregaEstimad(LocalDate fechaEntregaEstimad) { this.fechaEntregaEstimad = fechaEntregaEstimad; }

    public double getTarifa() { return tarifa; }
    public void setTarifa(double tarifa) { this.tarifa = tarifa; }


    public enum TipoEnvio {
        EXPRESS,
        ESTANDAR
    }

}