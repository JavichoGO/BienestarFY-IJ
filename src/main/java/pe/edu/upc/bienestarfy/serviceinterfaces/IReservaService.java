package pe.edu.upc.bienestarfy.serviceinterfaces;

import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.Reserva;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface IReservaService {
    public boolean Insert(Reserva Reserva);
    public void delete(int idReserva);
    Optional<Reserva> listarId(int idReserva);
    List<Reserva> list();
    List<Reserva>search(String nombreReserva);
    List<Reserva>searchUsuario(String reservaUsuario);
}
