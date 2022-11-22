package pe.edu.upc.bienestarfy.entities;

public class RespuestaUsuarioHorario {
    private Integer id;
    private String horario;
    private String usuario;
    private String categoria;

    public RespuestaUsuarioHorario() {
    }

    public RespuestaUsuarioHorario(Integer id, String horario, String usuario, String categoria) {
        this.id = id;
        this.horario = horario;
        this.usuario = usuario;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
