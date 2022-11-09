package pe.edu.upc.bienestarfy.entities;

import javax.persistence.*;

@Entity
@Table(name="TipoSuscripcion")
public class TipoSuscripcion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoSuscripcion;

    @Column(name = "nombreTipoSuscripcion", length = 100, nullable = false)
    private String nombreTipoSuscripcion;

    @Column(name = "descricpcionTipoSuscripcion", length = 100, nullable = true)
    private String descricpcionTipoSuscripcion;

    @Column(name = "descuentoTipoSuscripcion", nullable = false)
    private int descuentoTipoSuscripcion;

    public TipoSuscripcion() {

    }

    public int getIdTipoSuscripcion() {
        return idTipoSuscripcion;
    }

    public void setIdTipoSuscripcion(int idTipoSuscripcion) {
        this.idTipoSuscripcion = idTipoSuscripcion;
    }

    public String getNombreTipoSuscripcion() {
        return nombreTipoSuscripcion;
    }

    public void setNombreTipoSuscripcion(String nombreTipoSuscripcion) {
        this.nombreTipoSuscripcion = nombreTipoSuscripcion;
    }
    public String getDescricpcionTipoSuscripcion() {
        return descricpcionTipoSuscripcion;
    }

    public void setDescricpcionTipoSuscripcion(String descricpcionTipoSuscripcion) {
        this.descricpcionTipoSuscripcion = descricpcionTipoSuscripcion;
    }

    public int getDescuentoTipoSuscripcion() {
        return descuentoTipoSuscripcion;
    }

    public void setDescuentoTipoSuscripcion(int descuentoTipoSuscripcion) {
        this.descuentoTipoSuscripcion = descuentoTipoSuscripcion;
    }

    public TipoSuscripcion(int idTipoSuscripcion, String nombreCategoria, String descricpcionTipoSuscripcion, int descuentoTipoSuscripcion, String nombreTipoSuscripcion) {
        this.idTipoSuscripcion = idTipoSuscripcion;
        this.nombreTipoSuscripcion = nombreTipoSuscripcion;
        this.descricpcionTipoSuscripcion = descricpcionTipoSuscripcion;
        this.descuentoTipoSuscripcion = descuentoTipoSuscripcion;
    }
}
