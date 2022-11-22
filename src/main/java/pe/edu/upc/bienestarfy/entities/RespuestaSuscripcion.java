package pe.edu.upc.bienestarfy.entities;

public class RespuestaSuscripcion {
    private String suscripcion;
    private String cantidad;

    public RespuestaSuscripcion() {
    }

    public RespuestaSuscripcion(String suscripcion, String cantidad) {
        this.suscripcion = suscripcion;
        this.cantidad = cantidad;
    }

    public String getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(String suscripcion) {
        this.suscripcion = suscripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
