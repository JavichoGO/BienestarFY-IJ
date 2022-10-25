package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.bienestarfy.entities.TipoActividad;
import pe.edu.upc.bienestarfy.entities.TipoHorario;
import pe.edu.upc.bienestarfy.repositories.ITipoHorarioRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.ITipoHorarioService;

import java.util.List;
@Service

public class TipoHorarioServiceImp implements ITipoHorarioService {
    @Autowired
    private ITipoHorarioRepository pR;
    @Override
    public void Insert(TipoHorario tipohorario) {
        pR.save(tipohorario);
    }
    @Override
    public List<TipoHorario> list() {
        return pR.findAll();
    }

}
