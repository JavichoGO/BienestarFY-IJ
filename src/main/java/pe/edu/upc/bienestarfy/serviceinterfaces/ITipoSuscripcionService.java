package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.Role;
import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;

import java.util.List;
import java.util.Optional;

public interface ITipoSuscripcionService {
    public void Insert(TipoSuscripcion tiposuscripcion);
    List<TipoSuscripcion> list();
    public void delete(int idTipoSuscripcion);
    public Optional<TipoSuscripcion> listarId(int idTipoSuscripcion);
    List<TipoSuscripcion>search(String nombreTipoSuscripcion);

    List<TipoSuscripcion> buscarDescuento();
}
