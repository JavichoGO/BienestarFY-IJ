package pe.edu.upc.bienestarfy.entities;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="DetalleReserva")
public class DetalleReserva implements Serializable {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int idDetalleReserva;

	    @Column(name = "nombreDetalleReserva", length = 100, nullable = false)
	    private String nombreDetalleReserva;

	    @Column(name = "descripcionDetalleReserva", length = 100, nullable = false)
	    private String descripcionDetalleReserva;

	    @ManyToOne
	    @JoinColumn(name = "idReserva", nullable = false)
	    private Reserva reserva;

	    @ManyToOne
	    @JoinColumn(name = "idActividad", nullable = false)
	    private Actividad actividad;

	    
	    
		public DetalleReserva(int idDetalleReserva, String nombreDetalleReserva, String descripcionDetalleReserva,
				Reserva reserva, Actividad actividad) {
			this.idDetalleReserva = idDetalleReserva;
			this.nombreDetalleReserva = nombreDetalleReserva;
			this.descripcionDetalleReserva = descripcionDetalleReserva;
			this.reserva = reserva;
			this.actividad = actividad;
		}

		public DetalleReserva() {

		}

		public int getIdDetalleReserva() {
			return idDetalleReserva;
		}

		public void setIdDetalleReserva(int idDetalleReserva) {
			this.idDetalleReserva = idDetalleReserva;
		}

		public String getNombreDetalleReserva() {
			return nombreDetalleReserva;
		}

		public void setNombreDetalleReserva(String nombreDetalleReserva) {
			this.nombreDetalleReserva = nombreDetalleReserva;
		}

		public String getDescripcionDetalleReserva() {
			return descripcionDetalleReserva;
		}

		public void setDescripcionDetalleReserva(String descripcionDetalleReserva) {
			this.descripcionDetalleReserva = descripcionDetalleReserva;
		}

		public Reserva getReserva() {
			return reserva;
		}

		public void setReserva(Reserva reserva) {
			this.reserva = reserva;
		}

		public Actividad getActividad() {
			return actividad;
		}

		public void setActividad(Actividad actividad) {
			this.actividad = actividad;
		}
	    
	    
	    
	    
	    
}
