package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.TipoHorario;
import java.util.List;

public interface ITipoHorarioService {
    public void Insert(TipoHorario tipohorario);
    List<TipoHorario> list();

}
