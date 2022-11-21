package pe.edu.upc.bienestarfy.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipoHorario")
public class TipoHorario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoHorario;

    @Column(name = "nombreTipoHorario",length = 100,nullable = false)
    private String nombreTipoHorario;
    @Column(name = "descripcionTipoHorario",length = 500,nullable = true)
    private String descripcionTipoHorario;

    public int getIdTipoHorario() {
        return idTipoHorario;
    }

    public void setIdTipoHorario(int idTipoHorario) {
        this.idTipoHorario = idTipoHorario;
    }

    public String getNombreTipoHorario() {
        return nombreTipoHorario;
    }

    public void setNombreTipoHorario(String nombreTipoHorario) {
        this.nombreTipoHorario = nombreTipoHorario;
    }

    public String getDescripcionTipoHorario() {
        return descripcionTipoHorario;
    }

    public void setDescripcionTipoHorario(String descripcionTipoHorario) {
        this.descripcionTipoHorario = descripcionTipoHorario;
    }

    public TipoHorario() {
    }

    public TipoHorario(int idTipoHorario, String nombreTipoHorario, String descripcionTipoHorario) {
        this.idTipoHorario = idTipoHorario;
        this.nombreTipoHorario = nombreTipoHorario;
        this.descripcionTipoHorario = descripcionTipoHorario;
    }
}