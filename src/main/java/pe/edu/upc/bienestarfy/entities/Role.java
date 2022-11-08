package pe.edu.upc.bienestarfy.entities;


import javax.persistence.*;

@Entity
@Table(name = "Role")
public class Role {
//goo
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRole;

    @Column(name = "nombreRole", length = 100, nullable = false)
    private String nombreRole;
    @Column(name = "descripcionRole", length = 100, nullable = false)
    private String descripcionRole;

    public Role() {
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getNombreRole() {
        return nombreRole;
    }

    public void setNombreRole(String nombreRole) {
        this.nombreRole = nombreRole;
    }

    public String getDescripcionRole() {
        return descripcionRole;
    }

    public void setDescripcionRole(String descripcionRole) {
        this.descripcionRole = descripcionRole;
    }

    public Role(int idRole, String nombreRole, String descripcionRole) {
        this.idRole = idRole;
        this.nombreRole = nombreRole;
        this.descripcionRole = descripcionRole;
    }
}

