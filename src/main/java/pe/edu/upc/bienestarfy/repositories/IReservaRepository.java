package pe.edu.upc.bienestarfy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.bienestarfy.entities.Reserva;

import java.util.Date;
import java.util.List;

public interface IReservaRepository extends JpaRepository<Reserva,Integer> {
    @Query("FROM Reserva r " + "WHERE r.fechaReserva like %:fechaReserva")
    List<Reserva> buscarFecha(@Param("fechaReserva") Date fechaReserva);
    @Query("FROM Reserva r " + "WHERE r.usuario.nombreUsuario like %:nombreUsuario")
    List<Reserva> buscarnombreUsuario(@Param("nombreUsuario") String nombreUsuario);
}
