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

    @Column(name = "contraseñaUsuario", length = 36, nullable = false)
    private String contraseñaUsuario;

    @Column(name = "edadUsuario", nullable = false)
    private int edadUsuario;

    @ManyToOne
    @JoinColumn(name = "idRole", nullable = false)
    private Role role;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario, String contraseñaUsuario, int edadUsuario, Role role) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.correoUsuario = correoUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.edadUsuario = edadUsuario;
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

    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public int getEdadUsuario() {
        return edadUsuario;
    }

    public Role getRole() {
        return role;
    }

    public void setEdadUsuario(int edadUsuario) {
        this.edadUsuario = edadUsuario;
    }
}
