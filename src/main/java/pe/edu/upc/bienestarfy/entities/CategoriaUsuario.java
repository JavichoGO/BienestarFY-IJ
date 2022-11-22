package pe.edu.upc.bienestarfy.entities;

public class CategoriaUsuario {
	 private String nombreCategoria;
	 private Integer cantidad;
	public CategoriaUsuario(String nombreCategoria, Integer cantidad) {
		this.nombreCategoria = nombreCategoria;
		this.cantidad = cantidad;
	}
	public CategoriaUsuario() {

	}
	public String getNombreCategoria() {
		return nombreCategoria;
	}
	public void setNombreCategoria(String nombreCategoria) {
		this.nombreCategoria = nombreCategoria;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	 
	 
}
