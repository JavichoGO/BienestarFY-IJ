package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.bienestarfy.entities.Reserva;
import pe.edu.upc.bienestarfy.entities.ReservaUsuario;
import pe.edu.upc.bienestarfy.repositories.IReservaRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.IReservaService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
public class ReservaServiceImpl implements IReservaService {
    @Autowired
    private IReservaRepository rR;
    @Override
    @Transactional
    public boolean Insert(Reserva reserva) {
        Reserva objReserva = rR.save(reserva);
        if (objReserva == null) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public List<Reserva> list() {
        return rR.findAll();
    }
    @Override
    @Transactional
    public void delete(int idUsuario) {
        rR.deleteById(idUsuario);
    }
    @Override
    public List<Reserva> search(String nombreReserva) {
        return rR.buscarNombre(nombreReserva);
    }
    @Override
    public List<Reserva> searchUsuario(String nomUsuario) {
        return rR.buscarnombreUsuario(nomUsuario);
    }

    @Override
    public List<ReservaUsuario> buscarRESUS() {
        List<ReservaUsuario> lista=new ArrayList<>();
        rR.buscarRESUS().forEach(
                y->{
                    ReservaUsuario r= new ReservaUsuario();
                    r.setNombre_reserva(y[0]);
                    r.setFecha_reserva(y[1]);
                    r.setNombre_usuario(y[2]);
                    r.setApellido_usuario(y[3]);
                    r.setCorreo_usuario(y[4]);
                    r.setTelefono_usuario(Integer.valueOf(y[5]));
                    lista.add(r);
                }
        );
        return lista;
    }

    @Override
    public Optional<Reserva> listarId(int idReserva) {
        return rR.findById(idReserva);
    }

}