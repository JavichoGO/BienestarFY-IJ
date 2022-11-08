package pe.edu.upc.bienestarfy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="Reserva")
public class Reserva implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idReserva;

    @Column(name = "nombreReserva", length = 36, nullable = false)
    private Date nombreReserva;
    
    @Column(name = "fechaReserva", length = 36, nullable = false)
    private Date fechaReserva;

    @ManyToOne
    @JoinColumn(name = "idUsuario", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "idHorario", nullable = false)
    private Horario horario;

	public Reserva() {

	}

	public Reserva(int idReserva, Date nombreReserva, Date fechaReserva, Usuario usuario, Horario horario) {
		super();
		this.idReserva = idReserva;
		this.nombreReserva = nombreReserva;
		this.fechaReserva = fechaReserva;
		this.usuario = usuario;
		this.horario = horario;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Date getNombreReserva() {
		return nombreReserva;
	}

	public void setNombreReserva(Date nombreReserva) {
		this.nombreReserva = nombreReserva;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Horario getHorario() {
		return horario;
	}

	public void setHorario(Horario horario) {
		this.horario = horario;
	}
	
	

    
}