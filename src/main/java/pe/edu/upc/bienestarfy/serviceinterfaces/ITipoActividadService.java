package pe.edu.upc.bienestarfy.serviceinterfaces;
import pe.edu.upc.bienestarfy.entities.Role;
import pe.edu.upc.bienestarfy.entities.TipoActividad;
import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;

import java.util.List;
import java.util.Optional;

public interface ITipoActividadService {
    public void Insert(TipoActividad tipoActividad);
    List<TipoActividad> list();
    public void delete(int idTipoActividad);
    public Optional<TipoActividad> listarId(int idTipoActividad);
    List<TipoActividad>search(String nombreTipoActividad);
}
