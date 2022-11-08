package pe.edu.upc.bienestarfy.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "nombreUsuario", length = 36, nullable = false)
    private String nombreUsuario;

    @Column(name = "apellidoUsuario", length = 36, nullable = false)
    private String apellidoUsuario;

    @Column(name = "correoUsuario", length = 36, nullable = false)
    private String correoUsuario;

    @Column(name = "contrasenaUsuario", length = 36, nullable = false)
    private String contrasenaUsuario;

    @Column(name = "edadUsuario", nullable = false)
    private int edadUsuario;

    @Column(name = "telefonoUsuario", nullable = false)
    private int telefonoUsuario;
    
    @ManyToOne
    @JoinColumn(name = "idcategoria", nullable = false)
    private Categoria categoria;
    
    @ManyToOne
    @JoinColumn(name = "idSuscripcion", nullable = false)
    private Suscripcion suscripcion;
    
    @ManyToOne
    @JoinColumn(name = "idRole", nullable = false)
    private Role role;

	public Usuario() {

	}

	public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario,
			String contrasenaUsuario, int edadUsuario, int telefonoUsuario, Categoria categoria,
			Suscripcion suscripcion, Role role) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.correoUsuario = correoUsuario;
		this.contrasenaUsuario = contrasenaUsuario;
		this.edadUsuario = edadUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.categoria = categoria;
		this.suscripcion = suscripcion;
		this.role = role;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getContrasenaUsuario() {
		return contrasenaUsuario;
	}

	public void setContrasenaUsuario(String contrasenaUsuario) {
		this.contrasenaUsuario = contrasenaUsuario;
	}

	public int getEdadUsuario() {
		return edadUsuario;
	}

	public void setEdadUsuario(int edadUsuario) {
		this.edadUsuario = edadUsuario;
	}

	public int getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(int telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Suscripcion getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
    
}

    