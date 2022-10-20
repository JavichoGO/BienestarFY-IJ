package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;

import java.util.List;

public interface ITipoSuscripcionService {
    public void insert(TipoSuscripcion tiposuscripcion);

    List<TipoSuscripcion> list();
}
