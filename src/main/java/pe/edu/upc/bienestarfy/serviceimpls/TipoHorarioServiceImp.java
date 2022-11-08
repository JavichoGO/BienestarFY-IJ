package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.bienestarfy.entities.TipoActividad;
import pe.edu.upc.bienestarfy.entities.TipoHorario;
import pe.edu.upc.bienestarfy.repositories.ITipoHorarioRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.ITipoHorarioService;

import java.util.List;
import java.util.Optional;
@Service

public class TipoHorarioServiceImp implements ITipoHorarioService {
    @Autowired
    private ITipoHorarioRepository thR;
    @Override
    public void Insert(TipoHorario tipohorario) {
    	thR.save(tipohorario);
    }
    @Override
    public List<TipoHorario> list() {
        return thR.findAll();
    }
    @Override
    public void delete(int idTipoHorario) {
    	thR.deleteById(idTipoHorario);
    }
    @Override
    public List<TipoHorario> search(String nombreTipoHorario) {
        return thR.buscarNombre(nombreTipoHorario);
    }
	@Override
	public Optional<TipoHorario> listarId(int idTipoHorario) {
		return thR.findById(idTipoHorario);
	}
}
