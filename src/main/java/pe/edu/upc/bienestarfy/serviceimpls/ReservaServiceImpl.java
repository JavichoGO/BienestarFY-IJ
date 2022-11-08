package pe.edu.upc.bienestarfy.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.bienestarfy.entities.Reserva;
import pe.edu.upc.bienestarfy.repositories.IReservaRepository;
import pe.edu.upc.bienestarfy.serviceinterfaces.IReservaService;

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
    public List<Reserva> search(Date fechaReserva) {
        return rR.buscarFecha(fechaReserva);
    }
    @Override
    public List<Reserva> searchUsuario(String nombreUsuario) {
        return rR.buscarnombreUsuario(nombreUsuario);
    }
    @Override
    public Optional<Reserva> listarId(int idReserva) {
        return rR.findById(idReserva);
    }

}