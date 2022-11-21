package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.RespuestaUsuarios;
import pe.edu.upc.bienestarfy.repositories.IActividadRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.IActividadService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
public class ActividadServiceImpl implements IActividadService {
    @Autowired
    private IActividadRepository rA;
    @Override
    @Transactional
    public boolean Insert(Actividad actividad) {
        Actividad objActividad = rA.save(actividad);
        if (objActividad == null) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public List<Actividad> list() {
        return rA.findAll();
    }
    @Override
    @Transactional
    public void delete(int idActividad) {
        rA.deleteById(idActividad);
    }
    @Override
    public List<Actividad> search(String nombreActividad) {
        return rA.buscarNombre(nombreActividad);
    }
    @Override
    public List<Actividad> searchTipoActividad(String actTipo) {
        return rA.searchnombreTipoActividad(actTipo);
    }
    @Override
    public Optional<Actividad> listarId(int idActividad) {
        return rA.findById(idActividad);
    }
    @Override
    public List<RespuestaUsuarios> buscarCantidadActividades() {
        List<RespuestaUsuarios> lista=new ArrayList<>();
        rA.buscarCantidadActividades().forEach(y->{
            RespuestaUsuarios c = new RespuestaUsuarios();
            c.setUsuario(y[0]);
            c.setCantidad(y[1]);
            lista.add(c);
        });
        return lista;
    }
}
