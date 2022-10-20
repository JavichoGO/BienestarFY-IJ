package pe.edu.upc.bienestarfy.entities;

import javax.persistence.*;

@Entity
@Table(name = "TipoHorario")
public class TipoHorario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoHorario;

    @Column(name = "nombreTipoHorario",length = 45,nullable = false)
    private String nombreTipoHorario;
    @Column(name = "descripcionTipoHorario",length = 45,nullable = false)
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

    public TipoHorario(int idTipoHorario, String descripcionTipoHorario, String nombreTipoHorario) {
        this.idTipoHorario = idTipoHorario;
        this.descripcionTipoHorario = descripcionTipoHorario;
        this.nombreTipoHorario = nombreTipoHorario;
    }
}