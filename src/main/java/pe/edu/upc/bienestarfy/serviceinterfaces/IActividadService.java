package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.RespuestaUsuarios;
import pe.edu.upc.bienestarfy.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface IActividadService {

    public boolean Insert(Actividad actividad);
    public void delete(int idActividad);
    Optional<Actividad> listarId(int idActividad);
    List<Actividad> list();
    List<Actividad>search(String nombreActividad);

    List<Actividad>searchTipoActividad(String actTipo);

    List<RespuestaUsuarios> buscarCantidadActividades();
    
    List<Actividad> buscarDuracion();
}
