package pe.edu.upc.bienestarfy.serviceinterfaces;
import pe.edu.upc.bienestarfy.entities.TipoActividad;
import java.util.List;

public interface ITipoActividadService {
    public void Insert(TipoActividad tipoActividad);
    List<TipoActividad> list();
}
