package pe.edu.upc.bienestarfy.entities;

public class ReservaUsuario {

    private String nombre_reserva;
    private String fecha_reserva;
    private String nombre_usuario;
    private String apellido_usuario;
    private String correo_usuario;
    private Integer telefono_usuario;

    public ReservaUsuario() {
    }

    public ReservaUsuario(String nombre_reserva, String fecha_reserva, String nombre_usuario, String apellido_usuario, String correo_usuario, Integer telefono_usuario) {
        this.nombre_reserva = nombre_reserva;
        this.fecha_reserva = fecha_reserva;
        this.nombre_usuario = nombre_usuario;
        this.apellido_usuario = apellido_usuario;
        this.correo_usuario = correo_usuario;
        this.telefono_usuario = telefono_usuario;
    }

    public String getNombre_reserva() {
        return nombre_reserva;
    }

    public void setNombre_reserva(String nombre_reserva) {
        this.nombre_reserva = nombre_reserva;
    }

    public String getFecha_reserva() {
        return fecha_reserva;
    }

    public void setFecha_reserva(String fecha_reserva) {
        this.fecha_reserva = fecha_reserva;
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getApellido_usuario() {
        return apellido_usuario;
    }

    public void setApellido_usuario(String apellido_usuario) {
        this.apellido_usuario = apellido_usuario;
    }

    public String getCorreo_usuario() {
        return correo_usuario;
    }

    public void setCorreo_usuario(String correo_usuario) {
        this.correo_usuario = correo_usuario;
    }

    public Integer getTelefono_usuario() {
        return telefono_usuario;
    }

    public void setTelefono_usuario(Integer telefono_usuario) {
        this.telefono_usuario = telefono_usuario;
    }
}

