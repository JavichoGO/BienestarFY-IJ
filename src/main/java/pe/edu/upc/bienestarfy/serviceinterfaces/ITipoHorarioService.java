package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.TipoActividad;
import pe.edu.upc.bienestarfy.entities.TipoHorario;
import java.util.List;
import java.util.Optional;

public interface ITipoHorarioService {
    public void Insert(TipoHorario tipohorario);
    List<TipoHorario> list();
    public void delete(int idTipoHorario);
    public Optional<TipoHorario> listarId(int idTipoHorario);
    List<TipoHorario>search(String nombreTipoHorario);
}
