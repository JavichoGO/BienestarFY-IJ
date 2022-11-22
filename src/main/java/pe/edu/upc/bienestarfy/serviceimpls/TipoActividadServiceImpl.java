package pe.edu.upc.bienestarfy.serviceimpls;

import pe.edu.upc.bienestarfy.repositories.ITipoActividadRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.ITipoActividadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.bienestarfy.entities.ReservaUsuario;
import pe.edu.upc.bienestarfy.entities.TADetalleReserva;
import pe.edu.upc.bienestarfy.entities.TipoActividad;
import pe.edu.upc.bienestarfy.entities.TipoSuscripcion;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TipoActividadServiceImpl implements ITipoActividadService {
    @Autowired
    private ITipoActividadRepository taS;
    @Override
    public void Insert(TipoActividad tipoActividad) {taS.save(tipoActividad);}
    @Override
    public List<TipoActividad> list() {
        return taS.findAll();
    }
    @Override
    public void delete(int idTipoActividad) {
    	taS.deleteById(idTipoActividad);
    }
    @Override
    public List<TipoActividad> search(String nombreTipoActividad) {
        return taS.buscarNombre(nombreTipoActividad);
    }
	@Override
	public Optional<TipoActividad> listarId(int idTipoActividad) {
		return taS.findById(idTipoActividad);
	}
    @Override
    public List<TADetalleReserva> contadorTipoActividad() {
        List<TADetalleReserva> lista=new ArrayList<>();
        taS.contadorTipoActividad().forEach(
                y->{
                	TADetalleReserva r= new TADetalleReserva();
                    r.setTipoActividad(y[0]);
                    r.setCantidad(Integer.valueOf(y[1]));
                    lista.add(r);
                }
        );
        return lista;
    }

   

}






