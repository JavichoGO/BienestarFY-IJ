package pe.edu.upc.bienestarfy.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Actividad")
public class Actividad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idActividad;

    @Column(name = "nombreActividad", length = 100, nullable = false)
    private String nombreActividad;

    @Column(name = "descripcionActividad", length = 100, nullable = false)
    private String descripcionActividad;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idTipoActividad", nullable = false)
    private TipoActividad tipoactividad;

    public Actividad(int idActividad, String nombreActividad, String descripcionActividad, Usuario usuario, TipoActividad tipoactividad) {
        this.idActividad = idActividad;
        this.nombreActividad = nombreActividad;
        this.descripcionActividad = descripcionActividad;
        this.usuario = usuario;
        this.tipoactividad = tipoactividad;
    }

    private Actividad(){

    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDescripcionActividad() {
        return descripcionActividad;
    }

    public void setDescripcionActividad(String descripcionActividad) {
        this.descripcionActividad = descripcionActividad;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public TipoActividad getTipoactividad() {
        return tipoactividad;
    }

    public void setTipoactividad(TipoActividad tipoactividad) {
        this.tipoactividad = tipoactividad;
    }







}
