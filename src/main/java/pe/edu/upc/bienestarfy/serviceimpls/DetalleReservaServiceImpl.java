package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.DetalleReserva;
import pe.edu.upc.bienestarfy.repositories.IActividadRepository;
import pe.edu.upc.bienestarfy.repositories.IDetalleReservaRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.IActividadService;
import pe.edu.upc.bienestarfy.serviceinterfaces.IDetalleReservaService;

import java.util.List;
import java.util.Optional;


@RestController
public class DetalleReservaServiceImpl implements IDetalleReservaService {

	 @Autowired
	    private IDetalleReservaRepository drR;
	    @Override
	    @Transactional
	    public boolean Insert(DetalleReserva detalleReserva) {
	    	DetalleReserva objDetalleReserva = drR.save(detalleReserva);
	        if (objDetalleReserva == null) {
	            return false;
	        } else {
	            return true;
	        }
	    }
	    @Override
	    public List<DetalleReserva> list() {
	        return drR.findAll();
	    }
	    @Override
	    @Transactional
	    public void delete(int idDetalleReserva) {
	    	drR.deleteById(idDetalleReserva);
	    }
	    @Override
	    public List<DetalleReserva> search(String nombreDetalleReserva) {
	        return drR.buscarNombre(nombreDetalleReserva);
	    }
	    @Override
	    public List<DetalleReserva> searchDetalleReserva(String res) {
	        return drR.searchnombreReserva(res);
	    }
	    @Override
	    public Optional<DetalleReserva> listarId(int idDetalleReserva) {
	        return drR.findById(idDetalleReserva);
	    }
	}
