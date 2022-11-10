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

    @Column(name = "duracionActividad", length = 100, nullable = false)
    private String duracionActividad;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idTipoActividad", nullable = false)
    private TipoActividad tipoActividad;

 

    public Actividad(int idActividad, String nombreActividad, String descripcionActividad, String duracionActividad,
			Usuario usuario, TipoActividad tipoActividad) {
		super();
		this.idActividad = idActividad;
		this.nombreActividad = nombreActividad;
		this.descripcionActividad = descripcionActividad;
		this.duracionActividad = duracionActividad;
		this.usuario = usuario;
		this.tipoActividad = tipoActividad;
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



	public String getDuracionActividad() {
		return duracionActividad;
	}



	public void setDuracionActividad(String duracionActividad) {
		this.duracionActividad = duracionActividad;
	}



	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public TipoActividad getTipoActividad() {
		return tipoActividad;
	}



	public void setTipoActividad(TipoActividad tipoActividad) {
		this.tipoActividad = tipoActividad;
	}



	private Actividad(){

    }

}
