package pe.edu.upc.bienestarfy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.bienestarfy.entities.Suscripcion;

import java.util.List;

public interface ISuscripcionRepository extends JpaRepository<Suscripcion,Integer> {
    //JPQL
    @Query("FROM Suscripcion s " + "WHERE s.nombreSuscripcion like %:nombreSuscripcion")
    List<Suscripcion> buscarSuscripcion(@Param("nombreSuscripcion") String nombreSuscripcion);

    @Query("from Suscripcion s where s.tipoSuscripcion.nombreTipoSuscripcion like %:nombreTipoSuscripcion%")
    List<Suscripcion> buscarnombreTipoSuscripcion(@Param("nombreTipoSuscripcion") String nombreTipoSuscripcion);
    @Query(value ="select to_char(AVG(precio_suscripcion), 'FM999999990.00') from suscripcion ",nativeQuery = true)
    List<String[]> PromedioPrecios();
}