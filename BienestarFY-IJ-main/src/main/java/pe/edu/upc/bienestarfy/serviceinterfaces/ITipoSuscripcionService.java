package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;

import java.util.List;

public interface ITipoSuscripcionService {
    public void Insert(TipoSuscripcion tiposuscripcion);
    List<TipoSuscripcion> list();
    public void delete(int idTipoSuscripcion);
    List<TipoSuscripcion>search(String nombreTipoSuscripcion);
}
