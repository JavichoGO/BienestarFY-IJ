package pe.edu.upc.bienestarfy.entities;

import java.math.BigInteger;

public class TADetalleReserva {
    private String tipoActividad;
    private Integer cantidad;
	public TADetalleReserva() {

	}
	public String getTipoActividad() {
		return tipoActividad;
	}
	public void setTipoActividad(String tipoActividad) {
		this.tipoActividad = tipoActividad;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public TADetalleReserva(String tipoActividad, Integer cantidad) {

		this.tipoActividad = tipoActividad;
		this.cantidad = cantidad;
	}

    

    
    
    
}
