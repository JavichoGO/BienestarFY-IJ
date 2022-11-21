package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.Horario;
import pe.edu.upc.bienestarfy.repositories.IActividadRepository;
import pe.edu.upc.bienestarfy.repositories.IHorarioRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.IActividadService;
import pe.edu.upc.bienestarfy.serviceinterfaces.IHorarioService;

import java.util.List;
import java.util.Optional;

@RestController
public class HorarioServiceImpl implements IHorarioService{
	@Autowired
	private IHorarioRepository hR;
	@Override
	@Transactional
	public boolean Insert(Horario horario) {
		Horario objHorario = hR.save(horario);
        if (objHorario == null) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public List<Horario> list() {
        return hR.findAll();
    }
    @Override
    @Transactional
    public void delete(int idHorario) {
    	hR.deleteById(idHorario);
    }
    @Override
    public List<Horario> search(String nombreHorario) {
        return hR.buscarNombre(nombreHorario);
    }
    

    @Override
    public List<Horario> searchTipoHorario(String horTipo) {
        return hR.searchnombreTipoHorario(horTipo);
    }
    @Override
    public Optional<Horario> listarId(int idHorario) {
        return hR.findById(idHorario);
    }
}

