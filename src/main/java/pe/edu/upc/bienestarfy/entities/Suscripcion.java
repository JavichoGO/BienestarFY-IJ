package pe.edu.upc.bienestarfy.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Suscripcion")
public class Suscripcion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;

    @Column(name = "nombreSuscripcion", length = 36, nullable = false)
    private String nombreSuscripcion;

    @Column(name = "precioSuscripcion", nullable = false)
    private int precioSuscripcion;

    @Column(name = "fechaInicioSuscripcion", length = 36, nullable = false)
    private String fechaInicioSuscripcion;

    @Column(name = "fechaFinSuscripcion", length = 36, nullable = false)
    private String fechaFinSuscripcion;

    @ManyToOne
    @JoinColumn(name = "idTipoSuscripcion", nullable = false)
    private TipoSuscripcion tipoSuscripcion;


    public Suscripcion() {
    }
    public Suscripcion(int idSuscripcion, String nombreSuscripcion, int precioSuscripcion, String fechaInicioSuscripcion, String fechaFinSuscripcion, TipoSuscripcion tipoSuscripcion) {
        this.idSuscripcion = idSuscripcion;
        this.nombreSuscripcion = nombreSuscripcion;
        this.precioSuscripcion = precioSuscripcion;
        this.fechaInicioSuscripcion = fechaInicioSuscripcion;
        this.fechaFinSuscripcion = fechaFinSuscripcion;
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public int getIdSuscripcion() {
        return idSuscripcion;
    }

    public void setIdSuscripcion(int idSuscripcion) {
        this.idSuscripcion = idSuscripcion;
    }

    public String getNombreSuscripcion() {
        return nombreSuscripcion;
    }

    public void setNombreSuscripcion(String nombreSuscripcion) {
        this.nombreSuscripcion = nombreSuscripcion;
    }

    public int getPrecioSuscripcion() {
        return precioSuscripcion;
    }

    public void setPrecioSuscripcion(int precioSuscripcion) {
        this.precioSuscripcion = precioSuscripcion;
    }

    public String getFechaInicioSuscripcion() {
        return fechaInicioSuscripcion;
    }

    public void setFechaInicioSuscripcion(String fechaInicioSuscripcion) {
        this.fechaInicioSuscripcion = fechaInicioSuscripcion;
    }

    public String getFechaFinSuscripcion() {
        return fechaFinSuscripcion;
    }

    public void setFechaFinSuscripcion(String fechaFinSuscripcion) {
        this.fechaFinSuscripcion = fechaFinSuscripcion;
    }

    public TipoSuscripcion getTipoSuscripcion() {
        return tipoSuscripcion;
    }

    public void setTipoSuscripcion(TipoSuscripcion tipoSuscripcion) {
        this.tipoSuscripcion = tipoSuscripcion;
    }
}