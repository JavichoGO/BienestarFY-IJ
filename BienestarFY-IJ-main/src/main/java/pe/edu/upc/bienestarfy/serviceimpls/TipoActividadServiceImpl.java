package pe.edu.upc.bienestarfy.serviceimpls;

import pe.edu.upc.bienestarfy.repositories.ITipoActividadRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.ITipoActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.bienestarfy.entities.TipoActividad;

import java.util.List;

@Service
public class TipoActividadServiceImpl implements ITipoActividadService {
    @Autowired
    private ITipoActividadRepository tR;
    @Override
    public void Insert(TipoActividad tipoactividad) {tR.save(tipoactividad);}
    @Override
    public List<TipoActividad> list() {
        return tR.findAll();
    }
    @Override
    public void delete(int idTipoActividad) {
        tR.deleteById(idTipoActividad);
    }
    @Override
    public List<TipoActividad> search(String nombreTipoActividad) {
        return tR.buscarNombre(nombreTipoActividad);
    }
}


