package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;
import pe.edu.upc.bienestarfy.repositories.ITipoSuscripcionRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.ITipoSuscripcionService;

import java.util.List;
import java.util.Optional;

@Service
public class TipoSuscripcionServiceImpl implements ITipoSuscripcionService {

    @Autowired
    private ITipoSuscripcionRepository tsR;

    @Override
    public void Insert(TipoSuscripcion tipoSuscripcion) { tsR.save(tipoSuscripcion);}

    @Override
    public List<TipoSuscripcion> list() {return tsR.findAll();}
    @Override
    public void delete(int idTipoSuscripcion) {
        tsR.deleteById(idTipoSuscripcion);
    }
    @Override
    public List<TipoSuscripcion> search(String nombreTipoSuscripcion) {
        return tsR.buscarNombre(nombreTipoSuscripcion);
    }

	@Override
	public Optional<TipoSuscripcion> listarId(int idTipoSuscripcion) {
		return tsR.findById(idTipoSuscripcion);
	}
}
