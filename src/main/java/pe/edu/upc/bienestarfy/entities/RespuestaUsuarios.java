package pe.edu.upc.bienestarfy.entities;

public class RespuestaUsuarios {
    private String usuario;
    private String cantidad;

    public RespuestaUsuarios() {
    }

    public RespuestaUsuarios(String usuario, String cantidad) {
        this.usuario = usuario;
        this.cantidad = cantidad;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
