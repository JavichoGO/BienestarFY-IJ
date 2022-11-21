package pe.edu.upc.bienestarfy.entities;

import javax.persistence.*;

@Entity
@Table(name="Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;

    @Column(name = "nombreCategoria",length = 100,nullable = false)
    private String nombreCategoria;

    @Column(name = "descricpcionCategoria",length = 100,nullable = true)
    private String descricpcionCategoria;

    public Categoria() {
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    public String getDescricpcionCategoria() {
        return descricpcionCategoria;
    }

    public void setDescricpcionCategoria(String descricpcionCategoria) {
        this.descricpcionCategoria = descricpcionCategoria;
    }

    public Categoria(int idCategoria, String nombreCategoria, String descricpcionCategoria) {
        this.idCategoria = idCategoria;
        this.nombreCategoria = nombreCategoria;
        this.descricpcionCategoria = descricpcionCategoria;
    }
}
