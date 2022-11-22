package pe.edu.upc.bienestarfy.repositories;

import io.swagger.models.auth.In;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.bienestarfy.entities.Actividad;
import pe.edu.upc.bienestarfy.entities.DetalleReserva;

import java.util.List;

public interface IDetalleReservaRepository extends JpaRepository<DetalleReserva,Integer>{

	
    //JPQL
    @Query("FROM DetalleReserva a " + "WHERE a.nombreDetalleReserva like %:nombreDetalleReserva%")
    List<DetalleReserva> buscarNombre(@Param("nombreDetalleReserva") String nombreDetalleReserva);

    @Query("from DetalleReserva a where a.reserva.nombreReserva like %:nombreReserva%")
    List<DetalleReserva> searchnombreReserva(@Param("nombreReserva") String nombreReserva);
}

