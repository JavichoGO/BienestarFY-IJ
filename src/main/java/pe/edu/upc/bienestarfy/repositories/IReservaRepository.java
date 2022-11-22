package pe.edu.upc.bienestarfy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.bienestarfy.entities.Reserva;

import java.util.Date;
import java.util.List;

public interface IReservaRepository extends JpaRepository<Reserva,Integer> {
    @Query("FROM Reserva r " + "WHERE r.nombreReserva like %:nombreReserva")
    List<Reserva> buscarNombre(@Param("nombreReserva") String nombreReserva);
    @Query("FROM Reserva r WHERE r.usuario.nombreUsuario like %:nombreUsuario")
    List<Reserva> buscarnombreUsuario(@Param("nombreUsuario") String nombreUsuario);

    @Query(value="select r.nombre_reserva,r.fecha_reserva,u.nombre_usuario,u.apellido_usuario,u.correo_usuario,u.telefono_usuario from reserva r left join usuario u on r.id_usuario = u.id_usuario",nativeQuery = true)
    List<String[]> buscarRESUS();

}
