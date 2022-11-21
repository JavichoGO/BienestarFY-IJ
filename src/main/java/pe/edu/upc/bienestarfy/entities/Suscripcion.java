package pe.edu.upc.bienestarfy.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Suscripcion")
public class Suscripcion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSuscripcion;

    @Column(name = "nombreSuscripcion", length = 100, nullable = false)
    private String nombreSuscripcion;

    @Column(name = "precioSuscripcion", nullable = false)
    private int precioSuscripcion;

    @Column(name = "fechaInicio", length = 100, nullable = false)
    private String fechaInicio;

    @Column(name = "fechaFin", length = 100, nullable = false)
    private String fechaFin;

    @ManyToOne
    @JoinColumn(name = "idTipoSuscripcion", nullable = false)
    private TipoSuscripcion tipoSuscripcion;

	public Suscripcion() {

	}

	public Suscripcion(int idSuscripcion, String nombreSuscripcion, int precioSuscripcion, String fechaInicio,
			String fechaFin, TipoSuscripcion tipoSuscripcion) {
		this.idSuscripcion = idSuscripcion;
		this.nombreSuscripcion = nombreSuscripcion;
		this.precioSuscripcion = precioSuscripcion;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
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

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public TipoSuscripcion getTipoSuscripcion() {
		return tipoSuscripcion;
	}

	public void setTipoSuscripcion(TipoSuscripcion tipoSuscripcion) {
		this.tipoSuscripcion = tipoSuscripcion;
	}
	
	

    

}