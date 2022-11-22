package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;
import pe.edu.upc.bienestarfy.entities.RespuestaSuscripcionPromedio;
import pe.edu.upc.bienestarfy.entities.Suscripcion;

import java.util.List;
import java.util.Optional;
public interface ISuscripcionService {
    public boolean Insert(Suscripcion suscripcion);
    public void delete(int idSuscripcion);
    Optional<Suscripcion> listarId(int idSuscripcion);
    List<Suscripcion> list();
    List<Suscripcion>search(String nombreSuscripcion);
    List<Suscripcion>searchTipoSuscripcion(String roleSuscripcion);
    List<RespuestaSuscripcionPromedio> PromedioPrecios();
}
