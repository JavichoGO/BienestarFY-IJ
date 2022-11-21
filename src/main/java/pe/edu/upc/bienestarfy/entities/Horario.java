package pe.edu.upc.bienestarfy.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Horario")
public class Horario implements Serializable{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHorario;

    @Column(name = "nombreHorario", length = 100, nullable = false)
    private String nombreHorario;

    @Column(name = "descripcionHorario", length = 500, nullable = true)
    private String descripcionHorario;
    
    @Column(name = "fechaHorario", length = 100, nullable = false)
    private String fechaHorario;
    

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idTipoHorario", nullable = false)
    private TipoHorario tipoHorario;

	public Horario() {

	}

	public Horario(int idHorario, String nombreHorario, String descripcionHorario, String fechaHorario,
			 Usuario usuario, TipoHorario tipoHorario) {
		super();
		this.idHorario = idHorario;
		this.nombreHorario = nombreHorario;
		this.descripcionHorario = descripcionHorario;
		this.fechaHorario = fechaHorario;

		this.usuario = usuario;
		this.tipoHorario = tipoHorario;
	}

	public int getIdHorario() {
		return idHorario;
	}

	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
	}

	public String getNombreHorario() {
		return nombreHorario;
	}

	public void setNombreHorario(String nombreHorario) {
		this.nombreHorario = nombreHorario;
	}

	public String getDescripcionHorario() {
		return descripcionHorario;
	}

	public void setDescripcionHorario(String descripcionHorario) {
		this.descripcionHorario = descripcionHorario;
	}

	public String getFechaHorario() {
		return fechaHorario;
	}

	public void setFechaHorario(String fechaHorario) {
		this.fechaHorario = fechaHorario;
	}


	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoHorario getTipoHorario() {
		return tipoHorario;
	}

	public void setTipoHorario(TipoHorario tipoHorario) {
		this.tipoHorario = tipoHorario;
	}

	

    
}
