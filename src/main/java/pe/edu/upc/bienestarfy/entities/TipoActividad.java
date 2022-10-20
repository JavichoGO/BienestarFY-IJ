package pe.edu.upc.bienestarfy.entities;

import javax.persistence.*;

@Entity
@Table(name="TipoActividad")

public class TipoActividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoActividad;
    @Column(name = "nombreTipoActividad", length = 100, nullable = false)
    private String nombreTipoActividad;
    @Column(name = "descripcionTipoActividad", length = 100, nullable = false)
    private  String descripcionTipoActividad;

    public TipoActividad(int idTipoActividad, String nombreTipoActividad, String descripcionTipoActividad) {
        this.idTipoActividad = idTipoActividad;
        this.nombreTipoActividad = nombreTipoActividad;
        this.descripcionTipoActividad = descripcionTipoActividad;
    }

    public TipoActividad() {
    }

    public int getIdTipoActividad() {
        return idTipoActividad;
    }

    public void setIdTipoActividad(int idTipoActividad) {
        this.idTipoActividad = idTipoActividad;
    }

    public String getNombreTipoActividad() {
        return nombreTipoActividad;
    }

    public void setNombreTipoActividad(String nombreTipoActividad) {
        this.nombreTipoActividad = nombreTipoActividad;
    }

    public String getDescripcionTipoActividad() {
        return descripcionTipoActividad;
    }

    public void setDescripcionTipoActividad(String descripcionTipoActividad) {
        this.descripcionTipoActividad = descripcionTipoActividad;
    }

}
