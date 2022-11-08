package pe.edu.upc.bienestarfy.serviceinterfaces;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.DetalleReserva;

public interface IDetalleReservaService {

    public boolean Insert(DetalleReserva detalleReserva);
    public void delete(int idDetalleReserva);
    Optional<DetalleReserva> listarId(int idDetalleReserva);
    List<DetalleReserva> list();
    List<DetalleReserva>search(String nombreidDetalleReserva);

    List<DetalleReserva>searchDetalleReserva(String res);
    
}
