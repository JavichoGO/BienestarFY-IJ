package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.bienestarfy.entities.Suscripcion;
import pe.edu.upc.bienestarfy.repositories.ISuscripcionRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.ISuscripcionService;

import java.util.List;
import java.util.Optional;

@RestController
public class SuscripcionServiceImpl implements ISuscripcionService {
    @Autowired
    private ISuscripcionRepository rS;
    @Override
    @Transactional
    public boolean Insert(Suscripcion suscripcion) {
        Suscripcion objSuscripcion = rS.save(suscripcion);
        if (objSuscripcion == null) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public List<Suscripcion> list() {
        return rS.findAll();
    }
    @Override
    @Transactional
    public void delete(int idSuscripcion) {
        rS.deleteById(idSuscripcion);
    }
    @Override
    public List<Suscripcion> search(String nombreSuscripcion) {return rS.buscarSuscripcion(nombreSuscripcion);}

    @Override
    public List<Suscripcion> searchTipoSuscripcion(String tiposuscripcion) {return rS.buscarnombreTipoSuscripcion(tiposuscripcion);
    }
    @Override
    public Optional<Suscripcion> listarId(int idSuscripcion) {
        return rS.findById(idSuscripcion);
    }

}
