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

    @Column(name = "descripcionHorario", length = 100, nullable = false)
    private String descripcionHorario;
    
    @Column(name = "fechaHorario", length = 100, nullable = false)
    private String fechaHorario;
    
    @Column(name = "horaHorario", length = 100, nullable = false)
    private String horaHorario;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idTipoHorario", nullable = false)
    private TipoHorario tipoHorario;

	public Horario() {

	}

	public Horario(int idHorario, String nombreHorario, String descripcionHorario, String fechaHorario,
			String horaHorario, Usuario usuario, TipoHorario tipoHorario) {
		super();
		this.idHorario = idHorario;
		this.nombreHorario = nombreHorario;
		this.descripcionHorario = descripcionHorario;
		this.fechaHorario = fechaHorario;
		this.horaHorario = horaHorario;
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

	public String getHoraHorario() {
		return horaHorario;
	}

	public void setHoraHorario(String horaHorario) {
		this.horaHorario = horaHorario;
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
