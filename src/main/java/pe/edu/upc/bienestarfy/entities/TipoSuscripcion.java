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

    @Column(name = "descripcionTipoSuscripcion", length = 500, nullable = true)
    private String descripcionTipoSuscripcion;

    @Column(name = "descuentoTipoSuscripcion", nullable = false)
    private int descuentoTipoSuscripcion;
    

	public TipoSuscripcion() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getDescripcionTipoSuscripcion() {
		return descripcionTipoSuscripcion;
	}

	public void setDescripcionTipoSuscripcion(String descripcionTipoSuscripcion) {
		this.descripcionTipoSuscripcion = descripcionTipoSuscripcion;
	}

	public int getDescuentoTipoSuscripcion() {
		return descuentoTipoSuscripcion;
	}

	public void setDescuentoTipoSuscripcion(int descuentoTipoSuscripcion) {
		this.descuentoTipoSuscripcion = descuentoTipoSuscripcion;
	}

	

	public TipoSuscripcion(int idTipoSuscripcion, String nombreTipoSuscripcion, String descripcionTipoSuscripcion,
			int descuentoTipoSuscripcion) {
		super();
		this.idTipoSuscripcion = idTipoSuscripcion;
		this.nombreTipoSuscripcion = nombreTipoSuscripcion;
		this.descripcionTipoSuscripcion = descripcionTipoSuscripcion;
		this.descuentoTipoSuscripcion = descuentoTipoSuscripcion;
	}

   
}
