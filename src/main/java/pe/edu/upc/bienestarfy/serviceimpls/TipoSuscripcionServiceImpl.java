package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;
import pe.edu.upc.bienestarfy.repositories.ITipoSuscripcionRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.ITipoSuscripcionService;

import java.util.List;

@Service
public class TipoSuscripcionServiceImpl implements ITipoSuscripcionService {

    @Autowired
    private ITipoSuscripcionRepository tsR;

    @Override
    public void insert(TipoSuscripcion tiposuscripcion) { tsR.save(tiposuscripcion);}

    @Override
    public List<TipoSuscripcion> list() {return tsR.findAll();}
}
